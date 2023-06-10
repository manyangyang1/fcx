package com.ruoyi.project.fcbj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.fcbj.mapper.DExpectedMapper;
import com.ruoyi.project.fcbj.domain.DExpected;
import com.ruoyi.project.fcbj.service.IDExpectedService;

/**
 * 预期费用投放Service业务层处理
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Service
public class DExpectedServiceImpl implements IDExpectedService 
{
    @Autowired
    private DExpectedMapper dExpectedMapper;

    /**
     * 查询预期费用投放
     * 
     * @param expectedCode 预期费用投放主键
     * @return 预期费用投放
     */
    @Override
    public DExpected selectDExpectedByExpectedCode(String expectedCode)
    {
        return dExpectedMapper.selectDExpectedByExpectedCode(expectedCode);
    }

    /**
     * 查询预期费用投放列表
     * 
     * @param dExpected 预期费用投放
     * @return 预期费用投放
     */
    @Override
    public List<DExpected> selectDExpectedList(DExpected dExpected)
    {
        return dExpectedMapper.selectDExpectedList(dExpected);
    }

    /**
     * 新增预期费用投放
     * 
     * @param dExpected 预期费用投放
     * @return 结果
     */
    @Override
    public int insertDExpected(DExpected dExpected)
    {
        return dExpectedMapper.insertDExpected(dExpected);
    }

    /**
     * 修改预期费用投放
     * 
     * @param dExpected 预期费用投放
     * @return 结果
     */
    @Override
    public int updateDExpected(DExpected dExpected)
    {
        return dExpectedMapper.updateDExpected(dExpected);
    }

    /**
     * 批量删除预期费用投放
     * 
     * @param expectedCodes 需要删除的预期费用投放主键
     * @return 结果
     */
    @Override
    public int deleteDExpectedByExpectedCodes(String[] expectedCodes)
    {
        return dExpectedMapper.deleteDExpectedByExpectedCodes(expectedCodes);
    }

    /**
     * 删除预期费用投放信息
     * 
     * @param expectedCode 预期费用投放主键
     * @return 结果
     */
    @Override
    public int deleteDExpectedByExpectedCode(String expectedCode)
    {
        return dExpectedMapper.deleteDExpectedByExpectedCode(expectedCode);
    }
}
