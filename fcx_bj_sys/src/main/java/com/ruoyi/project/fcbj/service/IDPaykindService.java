package com.ruoyi.project.fcbj.service;

import java.util.List;
import com.ruoyi.project.fcbj.domain.DPaykind;

/**
 * 支付方式Service接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface IDPaykindService 
{
    /**
     * 查询支付方式
     * 
     * @param paycode 支付方式主键
     * @return 支付方式
     */
    public DPaykind selectDPaykindByPaycode(String paycode);

    /**
     * 查询支付方式列表
     * 
     * @param dPaykind 支付方式
     * @return 支付方式集合
     */
    public List<DPaykind> selectDPaykindList(DPaykind dPaykind);

    /**
     * 新增支付方式
     * 
     * @param dPaykind 支付方式
     * @return 结果
     */
    public int insertDPaykind(DPaykind dPaykind);

    /**
     * 修改支付方式
     * 
     * @param dPaykind 支付方式
     * @return 结果
     */
    public int updateDPaykind(DPaykind dPaykind);

    /**
     * 批量删除支付方式
     * 
     * @param paycodes 需要删除的支付方式主键集合
     * @return 结果
     */
    public int deleteDPaykindByPaycodes(String[] paycodes);

    /**
     * 删除支付方式信息
     * 
     * @param paycode 支付方式主键
     * @return 结果
     */
    public int deleteDPaykindByPaycode(String paycode);
}
