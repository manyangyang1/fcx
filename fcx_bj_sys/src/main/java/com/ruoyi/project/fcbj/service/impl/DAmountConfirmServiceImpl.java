package com.ruoyi.project.fcbj.service.impl;

import com.ruoyi.project.fcbj.domain.DAmountConfirm;
import com.ruoyi.project.fcbj.mapper.DAmountConfirmMapper;
import com.ruoyi.project.fcbj.service.IDAmountConfirmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 保险金额确定方式Service业务层处理
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Service
public class DAmountConfirmServiceImpl implements IDAmountConfirmService 
{
    @Autowired
    private DAmountConfirmMapper dAmountConfirmMapper;

    /**
     * 查询保险金额确定方式
     * 
     * @param propertyType 保险金额确定方式主键
     * @return 保险金额确定方式
     */
    @Override
    public DAmountConfirm selectDAmountConfirmByPropertyType(String propertyType)
    {
        return dAmountConfirmMapper.selectDAmountConfirmByPropertyType(propertyType);
    }

    /**
     * 查询保险金额确定方式列表
     * 
     * @param dAmountConfirm 保险金额确定方式
     * @return 保险金额确定方式
     */
    @Override
    public List<DAmountConfirm> selectDAmountConfirmList(DAmountConfirm dAmountConfirm)
    {
        return dAmountConfirmMapper.selectDAmountConfirmList(dAmountConfirm);
    }

    /**
     * 新增保险金额确定方式
     * 
     * @param dAmountConfirm 保险金额确定方式
     * @return 结果
     */
    @Override
    public int insertDAmountConfirm(DAmountConfirm dAmountConfirm)
    {
        return dAmountConfirmMapper.insertDAmountConfirm(dAmountConfirm);
    }

    /**
     * 修改保险金额确定方式
     * 
     * @param dAmountConfirm 保险金额确定方式
     * @return 结果
     */
    @Override
    public int updateDAmountConfirm(DAmountConfirm dAmountConfirm)
    {
        return dAmountConfirmMapper.updateDAmountConfirm(dAmountConfirm);
    }

    /**
     * 批量删除保险金额确定方式
     * 
     * @param propertyTypes 需要删除的保险金额确定方式主键
     * @return 结果
     */
    @Override
    public int deleteDAmountConfirmByPropertyTypes(String[] propertyTypes)
    {
        return dAmountConfirmMapper.deleteDAmountConfirmByPropertyTypes(propertyTypes);
    }

    /**
     * 删除保险金额确定方式信息
     * 
     * @param propertyType 保险金额确定方式主键
     * @return 结果
     */
    @Override
    public int deleteDAmountConfirmByPropertyType(String propertyType)
    {
        return dAmountConfirmMapper.deleteDAmountConfirmByPropertyType(propertyType);
    }
}
