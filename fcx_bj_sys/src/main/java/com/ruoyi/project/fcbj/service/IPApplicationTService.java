package com.ruoyi.project.fcbj.service;

import java.util.List;
import com.ruoyi.project.fcbj.domain.PApplicationT;

/**
 * 申请单Service接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface IPApplicationTService 
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
     * 批量删除申请单
     * 
     * @param rowIds 需要删除的申请单主键集合
     * @return 结果
     */
    public int deletePApplicationTByRowIds(String[] rowIds);

    /**
     * 删除申请单信息
     * 
     * @param rowId 申请单主键
     * @return 结果
     */
    public int deletePApplicationTByRowId(String rowId);
}
