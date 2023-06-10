package com.ruoyi.project.fcbj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.fcbj.mapper.DValueConfirmMapper;
import com.ruoyi.project.fcbj.domain.DValueConfirm;
import com.ruoyi.project.fcbj.service.IDValueConfirmService;

/**
 * 保险价值确定方式Service业务层处理
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Service
public class DValueConfirmServiceImpl implements IDValueConfirmService 
{
    @Autowired
    private DValueConfirmMapper dValueConfirmMapper;

    /**
     * 查询保险价值确定方式
     * 
     * @param propertyType 保险价值确定方式主键
     * @return 保险价值确定方式
     */
    @Override
    public DValueConfirm selectDValueConfirmByPropertyType(String propertyType)
    {
        return dValueConfirmMapper.selectDValueConfirmByPropertyType(propertyType);
    }

    /**
     * 查询保险价值确定方式列表
     * 
     * @param dValueConfirm 保险价值确定方式
     * @return 保险价值确定方式
     */
    @Override
    public List<DValueConfirm> selectDValueConfirmList(DValueConfirm dValueConfirm)
    {
        return dValueConfirmMapper.selectDValueConfirmList(dValueConfirm);
    }

    /**
     * 新增保险价值确定方式
     * 
     * @param dValueConfirm 保险价值确定方式
     * @return 结果
     */
    @Override
    public int insertDValueConfirm(DValueConfirm dValueConfirm)
    {
        return dValueConfirmMapper.insertDValueConfirm(dValueConfirm);
    }

    /**
     * 修改保险价值确定方式
     * 
     * @param dValueConfirm 保险价值确定方式
     * @return 结果
     */
    @Override
    public int updateDValueConfirm(DValueConfirm dValueConfirm)
    {
        return dValueConfirmMapper.updateDValueConfirm(dValueConfirm);
    }

    /**
     * 批量删除保险价值确定方式
     * 
     * @param propertyTypes 需要删除的保险价值确定方式主键
     * @return 结果
     */
    @Override
    public int deleteDValueConfirmByPropertyTypes(String[] propertyTypes)
    {
        return dValueConfirmMapper.deleteDValueConfirmByPropertyTypes(propertyTypes);
    }

    /**
     * 删除保险价值确定方式信息
     * 
     * @param propertyType 保险价值确定方式主键
     * @return 结果
     */
    @Override
    public int deleteDValueConfirmByPropertyType(String propertyType)
    {
        return dValueConfirmMapper.deleteDValueConfirmByPropertyType(propertyType);
    }
}
