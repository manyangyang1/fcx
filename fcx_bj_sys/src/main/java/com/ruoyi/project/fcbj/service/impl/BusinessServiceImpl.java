package com.ruoyi.project.fcbj.service.impl;

import com.ruoyi.common.constant.CommonConstant;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.framework.security.LoginUser;
import com.ruoyi.project.common.CommonUtil;
import com.ruoyi.project.fcbj.domain.*;
import com.ruoyi.project.fcbj.domain.vo.QuotationForm;
import com.ruoyi.project.fcbj.mapper.*;
import com.ruoyi.project.fcbj.service.BusinessService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class BusinessServiceImpl implements BusinessService {

    private final PEnterprisePropertyTMapper enterpriseMapper;
    private final PEnterprisePropertyDetailMapper enterpriseDetailMapper;
    private final PApplicationTMapper applicationMapper;
    private final PEnterprisePropertyAmountMapper amountMapper;
    private final PEnterprisePropertyAddressMapper addressMapper;
    private final BusinessMapper businessMapper;

    //字典相关mapper
    private final DInsuredMapper insuredMapper;
    private final DExpectedMapper expectedMapper;
    private final DAmountConfirmMapper amountConfirmMapper;
    private final DCredentialMapper credentialMapper;
    private final DCustomerdeptMapper customerdeptMapper;
    private final DPaykindMapper paykindMapper;
    private final DProductMapper productMapper;
    private final DRydmMapper rydmMapper;
    private final DUnitMapper unitMapper;
    private final DValueConfirmMapper valueConfirmMapper;

    private static final Map<String, String> INSURANCE_TYPE_DICT = new HashMap<>();

    static {
        INSURANCE_TYPE_DICT.put("1", "企财险");
        INSURANCE_TYPE_DICT.put("2", "公众险");
        INSURANCE_TYPE_DICT.put("3", "工程险");
        INSURANCE_TYPE_DICT.put("4", "建意险");
        INSURANCE_TYPE_DICT.put("5", "团意险");
        INSURANCE_TYPE_DICT.put("6", "雇主险");
        INSURANCE_TYPE_DICT.put("7", "船舶险");
        INSURANCE_TYPE_DICT.put("8", "货运险");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean insertQuotation(QuotationForm quotationForm) {
        /*
         * PApplicationT 中的status定义：
         * -1.撤回（暂时未见该状态）
         * 0.暂存
         * 1.中支发起，待分公司审核
         * 2.中支发起，分公司审核通过
         * 3.中支发起，分公司驳回
         * 4.中支发起,分公司驳回并流转例外申请至市场部
         * 5.市场部例外申请通过
         * 6.分公司例外审核通过，待领导审批
         * 7.领导例外审批通过审批通过
         * 8.报价结束（例外申请未通过）
         * */
        //分别取得申请单主信息，报价单主信息和报价单详情
        Long initSerialNo = 1L;
        //申请表信息
        PApplicationT application = buildApplication(quotationForm);
        application.setSerialno(initSerialNo);
        //报价单主表信息
        PEnterprisePropertyT enterprise = quotationForm.getEnterprise();
        enterprise.setApplicationNo(application.getApplicationNo());
        //enterprise_detail信息
        PEnterprisePropertyDetail enterpriseDetail = quotationForm.getEnterpriseDetail();
        enterpriseDetail.setApplicationNo(application.getApplicationNo());
        //创建数据时，初始版本号为1
        enterpriseDetail.setSerialno(initSerialNo);
        //P_ENTERPRISE_PROPERTY_AMOUNT表信息
        List<PEnterprisePropertyAmount> enterpriseAmountDetailList = quotationForm.getAmountDetailList();
        //list数据量不大，暂采用循环方式插入
        for (PEnterprisePropertyAmount pEnterprisePropertyAmount : enterpriseAmountDetailList) {
            pEnterprisePropertyAmount.setApplicationNo(application.getApplicationNo());
            pEnterprisePropertyAmount.setSerialno(initSerialNo);
            int result = amountMapper.insertPEnterprisePropertyAmount(pEnterprisePropertyAmount);
            if (result <= 0) {
                CommonUtil.rollbackTransaction();
                return false;
            }
        }
        //PEnterprisePropertyAddress表信息
        List<PEnterprisePropertyAddress> addressDetailList = quotationForm.getAddressDetailList();
        //list数据量不大，暂采用循环方式插入
        for (PEnterprisePropertyAddress pEnterprisePropertyAddress : addressDetailList) {
            pEnterprisePropertyAddress.setApplicationNo(application.getApplicationNo());
            pEnterprisePropertyAddress.setSerialno(initSerialNo);
            int result = addressMapper.insertPEnterprisePropertyAddress(pEnterprisePropertyAddress);
            if (result <= 0) {
                CommonUtil.rollbackTransaction();
                return false;
            }
        }
        int insertApplicationResult = applicationMapper.insertPApplicationT(application);
        int insertEnterpriseResult = enterpriseMapper.insertPEnterprisePropertyT(enterprise);
        int insertEnterpriseDetailResult = enterpriseDetailMapper.insertPEnterprisePropertyDetail(enterpriseDetail);
        boolean finalResult = checkNumberZero(insertApplicationResult, insertEnterpriseResult, insertEnterpriseDetailResult);
        if (!finalResult) {
            CommonUtil.rollbackTransaction();
        }
        return finalResult;
    }

    @Override
    public Map<String, Object> getDict(String insuranceType) {
        Map<String, Object> result = new HashMap<>();
        //流动资产保险金额确定方式下拉选项
        List<String> fixedAssetAmountConfirmList = businessMapper.selectAmountConfirmList(CommonConstant.PROPERTY_TYPE_FIXED_ASSET);
        result.put("fixedAssetAmountConfirmList", fixedAssetAmountConfirmList);
        //固定资产保险金额确定方式下拉选项
        List<String> currentAssetAmountConfirmList = businessMapper.selectAmountConfirmList(CommonConstant.PROPERTY_TYPE_CURRENT_ASSET);
        result.put("currentAssetAmountConfirmList", currentAssetAmountConfirmList);
        //查询共保方式下拉字典值
        List<Map<String, String>> coinsurerDictData = businessMapper.getCoinsurerDictData();
        result.put("coinsurerDictData", coinsurerDictData);
        //查询证件类型下拉字典值
        List<Map<String, String>> credentialDictData = businessMapper.getCredentialDictData();
        result.put("credentialDictData", credentialDictData);
        //查询客群分类下拉字典值
        List<Map<String, String>> customerCategoryDictData = businessMapper.getCustomerCategoryDictData();
        result.put("customerCategoryDictData", customerCategoryDictData);
        //查询预期费用投放方式下拉字典值
        List<Map<String, String>> expectedDictData = businessMapper.getExpectedDictData();
        result.put("expectedDictData", expectedDictData);
        //流动资产下拉选项（保额勾选）
        List<String> fixedAssetInsuredSelectList = businessMapper.getInsuredSelectedDictData(CommonConstant.PROPERTY_TYPE_FIXED_ASSET);
        result.put("fixedAssetInsuredSelectList", fixedAssetInsuredSelectList);
        //固定资产下拉选项（保额勾选）
        List<String> currentAssetInsuredSelectList = businessMapper.getInsuredSelectedDictData(CommonConstant.PROPERTY_TYPE_CURRENT_ASSET);
        result.put("currentAssetInsuredSelectList", currentAssetInsuredSelectList);
        //查询付款方式下拉字典值
        List<Map<String, String>> payKindDictData = businessMapper.getPayKindDictData();
        result.put("payKindDictData", payKindDictData);

        //根据保险类别查询明细险种下拉字典值
        List<Map<String, String>> insuranceDetailTypeDictData = businessMapper.getInsuranceDetailTypeDictDataByInsuranceType(INSURANCE_TYPE_DICT.get(insuranceType));
        result.put("insuranceDetailTypeDictData", insuranceDetailTypeDictData);

        //查询申报机构下拉字典值
        List<Map<String, String>> unitDictData = businessMapper.getUnitDictData();
        result.put("unitDictData", unitDictData);

        //流动资产保险金额确定方式下拉选项
        List<String> fixedAssetValueConfirmList = businessMapper.selectValueConfirmList(CommonConstant.PROPERTY_TYPE_FIXED_ASSET);
        result.put("fixedAssetValueConfirmList", fixedAssetValueConfirmList);
        //固定资产保险金额确定方式下拉选项
        List<String> currentAssetValueConfirmList = businessMapper.selectValueConfirmList(CommonConstant.PROPERTY_TYPE_CURRENT_ASSET);
        result.put("currentAssetValueConfirmList", currentAssetValueConfirmList);

        return result;
    }

    public boolean checkNumberZero(Integer... insertResults) {
        for (Integer insertResult : insertResults) {
            if (insertResult <= 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 构建application信息
     *
     * @param quotationForm
     * @return PApplicationT
     */
    public PApplicationT buildApplication(QuotationForm quotationForm) {
        PApplicationT application = quotationForm.getApplication();
        PEnterprisePropertyT enterprise = quotationForm.getEnterprise();
        LoginUser loginUser = SecurityUtils.getLoginUser();
        Long userId = loginUser.getUserId();
        Long deptId = loginUser.getDeptId();
        //报价单编号生成为：《投保人+投保险类》组合，《报价模板-企财险类.xlsx》中要求
        String applicationNo = enterprise.getApplyName() + INSURANCE_TYPE_DICT.get(quotationForm.getInsuranceType());
        application.setDepartmentGroupCode(deptId.toString());
        application.setApplicant(userId.toString());
        application.setApplicationDate(new Date());
        application.setApplicationNo(applicationNo);
        application.setInputCode(userId.toString());
        application.setStatus(quotationForm.getSaveType() == 0 ? "0" : "1");
        return application;
    }

    /**
     * 构建Enterprise主表信息
     *
     * @param quotationForm
     * @return PEnterprisePropertyT
     */
    public PEnterprisePropertyT buildEnterprise(QuotationForm quotationForm) {
        PEnterprisePropertyT enterprise = quotationForm.getEnterprise();

        return null;
    }
}
