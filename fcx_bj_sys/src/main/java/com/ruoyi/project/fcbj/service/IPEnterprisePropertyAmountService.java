package com.ruoyi.project.fcbj.service;

import java.util.List;
import com.ruoyi.project.fcbj.domain.PEnterprisePropertyAmount;

/**
 * 企财险保额Service接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface IPEnterprisePropertyAmountService 
{
    /**
     * 查询企财险保额
     * 
     * @param rowId 企财险保额主键
     * @return 企财险保额
     */
    public PEnterprisePropertyAmount selectPEnterprisePropertyAmountByRowId(String rowId);

    /**
     * 查询企财险保额列表
     * 
     * @param pEnterprisePropertyAmount 企财险保额
     * @return 企财险保额集合
     */
    public List<PEnterprisePropertyAmount> selectPEnterprisePropertyAmountList(PEnterprisePropertyAmount pEnterprisePropertyAmount);

    /**
     * 新增企财险保额
     * 
     * @param pEnterprisePropertyAmount 企财险保额
     * @return 结果
     */
    public int insertPEnterprisePropertyAmount(PEnterprisePropertyAmount pEnterprisePropertyAmount);

    /**
     * 修改企财险保额
     * 
     * @param pEnterprisePropertyAmount 企财险保额
     * @return 结果
     */
    public int updatePEnterprisePropertyAmount(PEnterprisePropertyAmount pEnterprisePropertyAmount);

    /**
     * 批量删除企财险保额
     * 
     * @param rowIds 需要删除的企财险保额主键集合
     * @return 结果
     */
    public int deletePEnterprisePropertyAmountByRowIds(String[] rowIds);

    /**
     * 删除企财险保额信息
     * 
     * @param rowId 企财险保额主键
     * @return 结果
     */
    public int deletePEnterprisePropertyAmountByRowId(String rowId);
}
