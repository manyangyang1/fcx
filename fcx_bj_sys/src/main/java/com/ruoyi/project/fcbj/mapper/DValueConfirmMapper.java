package com.ruoyi.project.fcbj.mapper;

import java.util.List;
import com.ruoyi.project.fcbj.domain.DValueConfirm;

/**
 * 保险价值确定方式Mapper接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface DValueConfirmMapper 
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
     * 删除保险价值确定方式
     * 
     * @param propertyType 保险价值确定方式主键
     * @return 结果
     */
    public int deleteDValueConfirmByPropertyType(String propertyType);

    /**
     * 批量删除保险价值确定方式
     * 
     * @param propertyTypes 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDValueConfirmByPropertyTypes(String[] propertyTypes);
}
