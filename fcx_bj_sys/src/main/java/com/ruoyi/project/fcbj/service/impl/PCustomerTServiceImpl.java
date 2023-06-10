package com.ruoyi.project.fcbj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.fcbj.mapper.PCustomerTMapper;
import com.ruoyi.project.fcbj.domain.PCustomerT;
import com.ruoyi.project.fcbj.service.IPCustomerTService;

/**
 * 客户信息Service业务层处理
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Service
public class PCustomerTServiceImpl implements IPCustomerTService 
{
    @Autowired
    private PCustomerTMapper pCustomerTMapper;

    /**
     * 查询客户信息
     * 
     * @param rowId 客户信息主键
     * @return 客户信息
     */
    @Override
    public PCustomerT selectPCustomerTByRowId(String rowId)
    {
        return pCustomerTMapper.selectPCustomerTByRowId(rowId);
    }

    /**
     * 查询客户信息列表
     * 
     * @param pCustomerT 客户信息
     * @return 客户信息
     */
    @Override
    public List<PCustomerT> selectPCustomerTList(PCustomerT pCustomerT)
    {
        return pCustomerTMapper.selectPCustomerTList(pCustomerT);
    }

    /**
     * 新增客户信息
     * 
     * @param pCustomerT 客户信息
     * @return 结果
     */
    @Override
    public int insertPCustomerT(PCustomerT pCustomerT)
    {
        return pCustomerTMapper.insertPCustomerT(pCustomerT);
    }

    /**
     * 修改客户信息
     * 
     * @param pCustomerT 客户信息
     * @return 结果
     */
    @Override
    public int updatePCustomerT(PCustomerT pCustomerT)
    {
        return pCustomerTMapper.updatePCustomerT(pCustomerT);
    }

    /**
     * 批量删除客户信息
     * 
     * @param rowIds 需要删除的客户信息主键
     * @return 结果
     */
    @Override
    public int deletePCustomerTByRowIds(String[] rowIds)
    {
        return pCustomerTMapper.deletePCustomerTByRowIds(rowIds);
    }

    /**
     * 删除客户信息信息
     * 
     * @param rowId 客户信息主键
     * @return 结果
     */
    @Override
    public int deletePCustomerTByRowId(String rowId)
    {
        return pCustomerTMapper.deletePCustomerTByRowId(rowId);
    }
}
