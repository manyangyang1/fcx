package com.ruoyi.project.fcbj.mapper;

import java.util.List;
import java.util.Map;

public interface BusinessMapper {

    /**
     * 根据资产类型查询保险金额确定方式下拉数据
     *
     * @param assetType 资产类型 1固定资产，2流动资产
     * @return List<String>
     */
    List<String> selectAmountConfirmList(String assetType);


    /**
     * 查询共保方式下拉字典数据
     *
     * @return List<Map < String, String>>
     */
    List<Map<String, String>> getCoinsurerDictData();

    /**
     * 查询证件类型下拉字典数据
     *
     * @return List<Map < String, String>>
     */
    List<Map<String, String>> getCredentialDictData();

    /**
     * 查询证件类型下拉字典数据
     *
     * @return List<Map < String, String>>
     */
    List<Map<String, String>> getCustomerCategoryDictData();

    /**
     * 查询预期费用投放下拉字典数据
     *
     * @return List<Map < String, String>>
     */
    List<Map<String, String>> getExpectedDictData();

    /**
     * 查询预保额勾选下拉字典数据
     *
     * @param assetType 资产类型 1固定资产，2流动资产
     * @return List<String>
     */
    List<String> getInsuredSelectedDictData(String assetType);

    /**
     * 查询支付方式下拉字典数据
     *
     * @return List<Map < String, String>>
     */
    List<Map<String, String>> getPayKindDictData();

    /**
     * 根据保险种类查询明细险种下拉字典数据
     *
     * @param insuranceType 保险种类
     * @return List<Map < String, String>>
     */
    List<Map<String, String>> getInsuranceDetailTypeDictDataByInsuranceType(String insuranceType);

    /**
     * 查询申报机构下拉字典数据
     *
     * @return List<Map < String, String>>
     */
    List<Map<String, String>> getUnitDictData();

    /**
     * 根据资产类型查询保险价值确定方式下拉数据
     *
     * @param assetType 资产类型 1固定资产，2流动资产
     * @return List<String>
     */
    List<String> selectValueConfirmList(String assetType);
}
