package com.ruoyi.project.fcbj.mapper;

import java.util.List;
import com.ruoyi.project.fcbj.domain.DCustomerdept;

/**
 * 客群Mapper接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface DCustomerdeptMapper 
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
     * 删除客群
     * 
     * @param customerdept 客群主键
     * @return 结果
     */
    public int deleteDCustomerdeptByCustomerdept(String customerdept);

    /**
     * 批量删除客群
     * 
     * @param customerdepts 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDCustomerdeptByCustomerdepts(String[] customerdepts);
}
