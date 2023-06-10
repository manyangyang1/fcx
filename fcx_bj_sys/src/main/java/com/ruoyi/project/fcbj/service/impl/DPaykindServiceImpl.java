package com.ruoyi.project.fcbj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.fcbj.mapper.DPaykindMapper;
import com.ruoyi.project.fcbj.domain.DPaykind;
import com.ruoyi.project.fcbj.service.IDPaykindService;

/**
 * 支付方式Service业务层处理
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Service
public class DPaykindServiceImpl implements IDPaykindService 
{
    @Autowired
    private DPaykindMapper dPaykindMapper;

    /**
     * 查询支付方式
     * 
     * @param paycode 支付方式主键
     * @return 支付方式
     */
    @Override
    public DPaykind selectDPaykindByPaycode(String paycode)
    {
        return dPaykindMapper.selectDPaykindByPaycode(paycode);
    }

    /**
     * 查询支付方式列表
     * 
     * @param dPaykind 支付方式
     * @return 支付方式
     */
    @Override
    public List<DPaykind> selectDPaykindList(DPaykind dPaykind)
    {
        return dPaykindMapper.selectDPaykindList(dPaykind);
    }

    /**
     * 新增支付方式
     * 
     * @param dPaykind 支付方式
     * @return 结果
     */
    @Override
    public int insertDPaykind(DPaykind dPaykind)
    {
        return dPaykindMapper.insertDPaykind(dPaykind);
    }

    /**
     * 修改支付方式
     * 
     * @param dPaykind 支付方式
     * @return 结果
     */
    @Override
    public int updateDPaykind(DPaykind dPaykind)
    {
        return dPaykindMapper.updateDPaykind(dPaykind);
    }

    /**
     * 批量删除支付方式
     * 
     * @param paycodes 需要删除的支付方式主键
     * @return 结果
     */
    @Override
    public int deleteDPaykindByPaycodes(String[] paycodes)
    {
        return dPaykindMapper.deleteDPaykindByPaycodes(paycodes);
    }

    /**
     * 删除支付方式信息
     * 
     * @param paycode 支付方式主键
     * @return 结果
     */
    @Override
    public int deleteDPaykindByPaycode(String paycode)
    {
        return dPaykindMapper.deleteDPaykindByPaycode(paycode);
    }
}
