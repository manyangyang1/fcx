package com.ruoyi.project.fcbj.service;

import java.util.List;
import com.ruoyi.project.fcbj.domain.DCustomerdept;

/**
 * 客群Service接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface IDCustomerdeptService 
{
    /**
     * 查询客群
     * 
     * @param customerdept 客群主键
     * @return 客群
     */
    public DCustomerdept selectDCustomerdeptByCustomerdept(String customerdept);

    /**
     * 查询客群列表
     * 
     * @param dCustomerdept 客群
     * @return 客群集合
     */
    public List<DCustomerdept> selectDCustomerdeptList(DCustomerdept dCustomerdept);

    /**
     * 新增客群
     * 
     * @param dCustomerdept 客群
     * @return 结果
     */
    public int insertDCustomerdept(DCustomerdept dCustomerdept);

    /**
     * 修改客群
     * 
     * @param dCustomerdept 客群
     * @return 结果
     */
    public int updateDCustomerdept(DCustomerdept dCustomerdept);

    /**
     * 批量删除客群
     * 
     * @param customerdepts 需要删除的客群主键集合
     * @return 结果
     */
    public int deleteDCustomerdeptByCustomerdepts(String[] customerdepts);

    /**
     * 删除客群信息
     * 
     * @param customerdept 客群主键
     * @return 结果
     */
    public int deleteDCustomerdeptByCustomerdept(String customerdept);
}
