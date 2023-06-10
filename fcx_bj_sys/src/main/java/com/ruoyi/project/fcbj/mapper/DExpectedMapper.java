package com.ruoyi.project.fcbj.mapper;

import java.util.List;
import com.ruoyi.project.fcbj.domain.DExpected;

/**
 * 预期费用投放Mapper接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface DExpectedMapper 
{
    /**
     * 查询预期费用投放
     * 
     * @param expectedCode 预期费用投放主键
     * @return 预期费用投放
     */
    public DExpected selectDExpectedByExpectedCode(String expectedCode);

    /**
     * 查询预期费用投放列表
     * 
     * @param dExpected 预期费用投放
     * @return 预期费用投放集合
     */
    public List<DExpected> selectDExpectedList(DExpected dExpected);

    /**
     * 新增预期费用投放
     * 
     * @param dExpected 预期费用投放
     * @return 结果
     */
    public int insertDExpected(DExpected dExpected);

    /**
     * 修改预期费用投放
     * 
     * @param dExpected 预期费用投放
     * @return 结果
     */
    public int updateDExpected(DExpected dExpected);

    /**
     * 删除预期费用投放
     * 
     * @param expectedCode 预期费用投放主键
     * @return 结果
     */
    public int deleteDExpectedByExpectedCode(String expectedCode);

    /**
     * 批量删除预期费用投放
     * 
     * @param expectedCodes 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDExpectedByExpectedCodes(String[] expectedCodes);
}
