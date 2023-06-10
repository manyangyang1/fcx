package com.ruoyi.project.fcbj.mapper;

import com.ruoyi.project.fcbj.domain.PEnterprisePropertyDetail;

import java.util.List;

/**
 * 企财险报价明细Mapper接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface PEnterprisePropertyDetailMapper 
{
    /**
     * 查询企财险报价明细
     * 
     * @param rowId 企财险报价明细主键
     * @return 企财险报价明细
     */
    public PEnterprisePropertyDetail selectPEnterprisePropertyDetailByRowId(String rowId);

    /**
     * 查询企财险报价明细列表
     * 
     * @param pEnterprisePropertyDetail 企财险报价明细
     * @return 企财险报价明细集合
     */
    public List<PEnterprisePropertyDetail> selectPEnterprisePropertyDetailList(PEnterprisePropertyDetail pEnterprisePropertyDetail);

    /**
     * 新增企财险报价明细
     * 
     * @param pEnterprisePropertyDetail 企财险报价明细
     * @return 结果
     */
    public int insertPEnterprisePropertyDetail(PEnterprisePropertyDetail pEnterprisePropertyDetail);

    /**
     * 修改企财险报价明细
     * 
     * @param pEnterprisePropertyDetail 企财险报价明细
     * @return 结果
     */
    public int updatePEnterprisePropertyDetail(PEnterprisePropertyDetail pEnterprisePropertyDetail);

    /**
     * 删除企财险报价明细
     * 
     * @param rowId 企财险报价明细主键
     * @return 结果
     */
    public int deletePEnterprisePropertyDetailByRowId(String rowId);

    /**
     * 批量删除企财险报价明细
     * 
     * @param rowIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePEnterprisePropertyDetailByRowIds(String[] rowIds);
}
