package com.ruoyi.project.fcbj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.fcbj.mapper.PApplicationTMapper;
import com.ruoyi.project.fcbj.domain.PApplicationT;
import com.ruoyi.project.fcbj.service.IPApplicationTService;

/**
 * 申请单Service业务层处理
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Service
public class PApplicationTServiceImpl implements IPApplicationTService 
{
    @Autowired
    private PApplicationTMapper pApplicationTMapper;

    /**
     * 查询申请单
     * 
     * @param rowId 申请单主键
     * @return 申请单
     */
    @Override
    public PApplicationT selectPApplicationTByRowId(String rowId)
    {
        return pApplicationTMapper.selectPApplicationTByRowId(rowId);
    }

    /**
     * 查询申请单列表
     * 
     * @param pApplicationT 申请单
     * @return 申请单
     */
    @Override
    public List<PApplicationT> selectPApplicationTList(PApplicationT pApplicationT)
    {
        return pApplicationTMapper.selectPApplicationTList(pApplicationT);
    }

    /**
     * 新增申请单
     * 
     * @param pApplicationT 申请单
     * @return 结果
     */
    @Override
    public int insertPApplicationT(PApplicationT pApplicationT)
    {
        return pApplicationTMapper.insertPApplicationT(pApplicationT);
    }

    /**
     * 修改申请单
     * 
     * @param pApplicationT 申请单
     * @return 结果
     */
    @Override
    public int updatePApplicationT(PApplicationT pApplicationT)
    {
        return pApplicationTMapper.updatePApplicationT(pApplicationT);
    }

    /**
     * 批量删除申请单
     * 
     * @param rowIds 需要删除的申请单主键
     * @return 结果
     */
    @Override
    public int deletePApplicationTByRowIds(String[] rowIds)
    {
        return pApplicationTMapper.deletePApplicationTByRowIds(rowIds);
    }

    /**
     * 删除申请单信息
     * 
     * @param rowId 申请单主键
     * @return 结果
     */
    @Override
    public int deletePApplicationTByRowId(String rowId)
    {
        return pApplicationTMapper.deletePApplicationTByRowId(rowId);
    }
}
