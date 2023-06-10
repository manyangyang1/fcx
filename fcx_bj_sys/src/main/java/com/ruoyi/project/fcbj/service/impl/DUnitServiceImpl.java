package com.ruoyi.project.fcbj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.fcbj.mapper.DUnitMapper;
import com.ruoyi.project.fcbj.domain.DUnit;
import com.ruoyi.project.fcbj.service.IDUnitService;

/**
 * 机构代码Service业务层处理
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Service
public class DUnitServiceImpl implements IDUnitService 
{
    @Autowired
    private DUnitMapper dUnitMapper;

    /**
     * 查询机构代码
     * 
     * @param xh 机构代码主键
     * @return 机构代码
     */
    @Override
    public DUnit selectDUnitByXh(Long xh)
    {
        return dUnitMapper.selectDUnitByXh(xh);
    }

    /**
     * 查询机构代码列表
     * 
     * @param dUnit 机构代码
     * @return 机构代码
     */
    @Override
    public List<DUnit> selectDUnitList(DUnit dUnit)
    {
        return dUnitMapper.selectDUnitList(dUnit);
    }

    /**
     * 新增机构代码
     * 
     * @param dUnit 机构代码
     * @return 结果
     */
    @Override
    public int insertDUnit(DUnit dUnit)
    {
        return dUnitMapper.insertDUnit(dUnit);
    }

    /**
     * 修改机构代码
     * 
     * @param dUnit 机构代码
     * @return 结果
     */
    @Override
    public int updateDUnit(DUnit dUnit)
    {
        return dUnitMapper.updateDUnit(dUnit);
    }

    /**
     * 批量删除机构代码
     * 
     * @param xhs 需要删除的机构代码主键
     * @return 结果
     */
    @Override
    public int deleteDUnitByXhs(Long[] xhs)
    {
        return dUnitMapper.deleteDUnitByXhs(xhs);
    }

    /**
     * 删除机构代码信息
     * 
     * @param xh 机构代码主键
     * @return 结果
     */
    @Override
    public int deleteDUnitByXh(Long xh)
    {
        return dUnitMapper.deleteDUnitByXh(xh);
    }
}
