package com.ruoyi.project.fcbj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.fcbj.mapper.DCustomerdeptMapper;
import com.ruoyi.project.fcbj.domain.DCustomerdept;
import com.ruoyi.project.fcbj.service.IDCustomerdeptService;

/**
 * 客群Service业务层处理
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Service
public class DCustomerdeptServiceImpl implements IDCustomerdeptService 
{
    @Autowired
    private DCustomerdeptMapper dCustomerdeptMapper;

    /**
     * 查询客群
     * 
     * @param customerdept 客群主键
     * @return 客群
     */
    @Override
    public DCustomerdept selectDCustomerdeptByCustomerdept(String customerdept)
    {
        return dCustomerdeptMapper.selectDCustomerdeptByCustomerdept(customerdept);
    }

    /**
     * 查询客群列表
     * 
     * @param dCustomerdept 客群
     * @return 客群
     */
    @Override
    public List<DCustomerdept> selectDCustomerdeptList(DCustomerdept dCustomerdept)
    {
        return dCustomerdeptMapper.selectDCustomerdeptList(dCustomerdept);
    }

    /**
     * 新增客群
     * 
     * @param dCustomerdept 客群
     * @return 结果
     */
    @Override
    public int insertDCustomerdept(DCustomerdept dCustomerdept)
    {
        return dCustomerdeptMapper.insertDCustomerdept(dCustomerdept);
    }

    /**
     * 修改客群
     * 
     * @param dCustomerdept 客群
     * @return 结果
     */
    @Override
    public int updateDCustomerdept(DCustomerdept dCustomerdept)
    {
        return dCustomerdeptMapper.updateDCustomerdept(dCustomerdept);
    }

    /**
     * 批量删除客群
     * 
     * @param customerdepts 需要删除的客群主键
     * @return 结果
     */
    @Override
    public int deleteDCustomerdeptByCustomerdepts(String[] customerdepts)
    {
        return dCustomerdeptMapper.deleteDCustomerdeptByCustomerdepts(customerdepts);
    }

    /**
     * 删除客群信息
     * 
     * @param customerdept 客群主键
     * @return 结果
     */
    @Override
    public int deleteDCustomerdeptByCustomerdept(String customerdept)
    {
        return dCustomerdeptMapper.deleteDCustomerdeptByCustomerdept(customerdept);
    }
}
