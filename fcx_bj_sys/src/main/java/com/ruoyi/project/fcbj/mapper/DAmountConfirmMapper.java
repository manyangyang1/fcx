package com.ruoyi.project.fcbj.mapper;

import java.util.List;
import com.ruoyi.project.fcbj.domain.DAmountConfirm;

/**
 * 保险金额确定方式Mapper接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface DAmountConfirmMapper 
{
    /**
     * 查询保险金额确定方式
     * 
     * @param propertyType 保险金额确定方式主键
     * @return 保险金额确定方式
     */
    public DAmountConfirm selectDAmountConfirmByPropertyType(String propertyType);

    /**
     * 查询保险金额确定方式列表
     * 
     * @param dAmountConfirm 保险金额确定方式
     * @return 保险金额确定方式集合
     */
    public List<DAmountConfirm> selectDAmountConfirmList(DAmountConfirm dAmountConfirm);

    /**
     * 新增保险金额确定方式
     * 
     * @param dAmountConfirm 保险金额确定方式
     * @return 结果
     */
    public int insertDAmountConfirm(DAmountConfirm dAmountConfirm);

    /**
     * 修改保险金额确定方式
     * 
     * @param dAmountConfirm 保险金额确定方式
     * @return 结果
     */
    public int updateDAmountConfirm(DAmountConfirm dAmountConfirm);

    /**
     * 删除保险金额确定方式
     * 
     * @param propertyType 保险金额确定方式主键
     * @return 结果
     */
    public int deleteDAmountConfirmByPropertyType(String propertyType);

    /**
     * 批量删除保险金额确定方式
     * 
     * @param propertyTypes 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDAmountConfirmByPropertyTypes(String[] propertyTypes);
}
