package com.ruoyi.project.fcbj.mapper;

import com.ruoyi.project.fcbj.domain.PEnterprisePropertyT;

import java.util.List;

/**
 * 企财险报价主Mapper接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface PEnterprisePropertyTMapper 
{
    /**
     * 查询企财险报价主
     * 
     * @param rowId 企财险报价主主键
     * @return 企财险报价主
     */
    public PEnterprisePropertyT selectPEnterprisePropertyTByRowId(String rowId);

    /**
     * 查询企财险报价主列表
     * 
     * @param pEnterprisePropertyT 企财险报价主
     * @return 企财险报价主集合
     */
    public List<PEnterprisePropertyT> selectPEnterprisePropertyTList(PEnterprisePropertyT pEnterprisePropertyT);

    /**
     * 新增企财险报价主
     * 
     * @param pEnterprisePropertyT 企财险报价主
     * @return 结果
     */
    public int insertPEnterprisePropertyT(PEnterprisePropertyT pEnterprisePropertyT);

    /**
     * 修改企财险报价主
     * 
     * @param pEnterprisePropertyT 企财险报价主
     * @return 结果
     */
    public int updatePEnterprisePropertyT(PEnterprisePropertyT pEnterprisePropertyT);

    /**
     * 删除企财险报价主
     * 
     * @param rowId 企财险报价主主键
     * @return 结果
     */
    public int deletePEnterprisePropertyTByRowId(String rowId);

    /**
     * 批量删除企财险报价主
     * 
     * @param rowIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePEnterprisePropertyTByRowIds(String[] rowIds);
}
