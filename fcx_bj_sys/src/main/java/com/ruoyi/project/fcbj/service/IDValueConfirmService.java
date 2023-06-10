package com.ruoyi.project.fcbj.service;

import java.util.List;
import com.ruoyi.project.fcbj.domain.DValueConfirm;

/**
 * 保险价值确定方式Service接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface IDValueConfirmService 
{
    /**
     * 查询保险价值确定方式
     * 
     * @param propertyType 保险价值确定方式主键
     * @return 保险价值确定方式
     */
    public DValueConfirm selectDValueConfirmByPropertyType(String propertyType);

    /**
     * 查询保险价值确定方式列表
     * 
     * @param dValueConfirm 保险价值确定方式
     * @return 保险价值确定方式集合
     */
    public List<DValueConfirm> selectDValueConfirmList(DValueConfirm dValueConfirm);

    /**
     * 新增保险价值确定方式
     * 
     * @param dValueConfirm 保险价值确定方式
     * @return 结果
     */
    public int insertDValueConfirm(DValueConfirm dValueConfirm);

    /**
     * 修改保险价值确定方式
     * 
     * @param dValueConfirm 保险价值确定方式
     * @return 结果
     */
    public int updateDValueConfirm(DValueConfirm dValueConfirm);

    /**
     * 批量删除保险价值确定方式
     * 
     * @param propertyTypes 需要删除的保险价值确定方式主键集合
     * @return 结果
     */
    public int deleteDValueConfirmByPropertyTypes(String[] propertyTypes);

    /**
     * 删除保险价值确定方式信息
     * 
     * @param propertyType 保险价值确定方式主键
     * @return 结果
     */
    public int deleteDValueConfirmByPropertyType(String propertyType);
}
