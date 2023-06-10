package com.ruoyi.project.fcbj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.fcbj.mapper.DInsuredMapper;
import com.ruoyi.project.fcbj.domain.DInsured;
import com.ruoyi.project.fcbj.service.IDInsuredService;

/**
 * 保额勾选Service业务层处理
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Service
public class DInsuredServiceImpl implements IDInsuredService 
{
    @Autowired
    private DInsuredMapper dInsuredMapper;

    /**
     * 查询保额勾选
     * 
     * @param insuredType 保额勾选主键
     * @return 保额勾选
     */
    @Override
    public DInsured selectDInsuredByInsuredType(String insuredType)
    {
        return dInsuredMapper.selectDInsuredByInsuredType(insuredType);
    }

    /**
     * 查询保额勾选列表
     * 
     * @param dInsured 保额勾选
     * @return 保额勾选
     */
    @Override
    public List<DInsured> selectDInsuredList(DInsured dInsured)
    {
        return dInsuredMapper.selectDInsuredList(dInsured);
    }

    /**
     * 新增保额勾选
     * 
     * @param dInsured 保额勾选
     * @return 结果
     */
    @Override
    public int insertDInsured(DInsured dInsured)
    {
        return dInsuredMapper.insertDInsured(dInsured);
    }

    /**
     * 修改保额勾选
     * 
     * @param dInsured 保额勾选
     * @return 结果
     */
    @Override
    public int updateDInsured(DInsured dInsured)
    {
        return dInsuredMapper.updateDInsured(dInsured);
    }

    /**
     * 批量删除保额勾选
     * 
     * @param insuredTypes 需要删除的保额勾选主键
     * @return 结果
     */
    @Override
    public int deleteDInsuredByInsuredTypes(String[] insuredTypes)
    {
        return dInsuredMapper.deleteDInsuredByInsuredTypes(insuredTypes);
    }

    /**
     * 删除保额勾选信息
     * 
     * @param insuredType 保额勾选主键
     * @return 结果
     */
    @Override
    public int deleteDInsuredByInsuredType(String insuredType)
    {
        return dInsuredMapper.deleteDInsuredByInsuredType(insuredType);
    }
}
