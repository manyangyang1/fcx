package com.ruoyi.project.fcbj.mapper;

import java.util.List;
import com.ruoyi.project.fcbj.domain.DPaykind;

/**
 * 支付方式Mapper接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface DPaykindMapper 
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
     * 删除支付方式
     * 
     * @param paycode 支付方式主键
     * @return 结果
     */
    public int deleteDPaykindByPaycode(String paycode);

    /**
     * 批量删除支付方式
     * 
     * @param paycodes 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDPaykindByPaycodes(String[] paycodes);
}
