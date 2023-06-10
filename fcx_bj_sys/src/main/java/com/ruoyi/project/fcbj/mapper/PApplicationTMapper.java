package com.ruoyi.project.fcbj.mapper;

import com.ruoyi.project.fcbj.domain.PApplicationT;

import java.util.List;

/**
 * 申请单Mapper接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface PApplicationTMapper 
{
    /**
     * 查询申请单
     * 
     * @param rowId 申请单主键
     * @return 申请单
     */
    public PApplicationT selectPApplicationTByRowId(String rowId);

    /**
     * 查询申请单列表
     * 
     * @param pApplicationT 申请单
     * @return 申请单集合
     */
    public List<PApplicationT> selectPApplicationTList(PApplicationT pApplicationT);

    /**
     * 新增申请单
     * 
     * @param pApplicationT 申请单
     * @return 结果
     */
    public int insertPApplicationT(PApplicationT pApplicationT);

    /**
     * 修改申请单
     * 
     * @param pApplicationT 申请单
     * @return 结果
     */
    public int updatePApplicationT(PApplicationT pApplicationT);

    /**
     * 删除申请单
     * 
     * @param rowId 申请单主键
     * @return 结果
     */
    public int deletePApplicationTByRowId(String rowId);

    /**
     * 批量删除申请单
     * 
     * @param rowIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePApplicationTByRowIds(String[] rowIds);
}
