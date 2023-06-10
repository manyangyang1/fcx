package com.ruoyi.project.fcbj.mapper;

import java.util.List;
import com.ruoyi.project.fcbj.domain.DInsured;

/**
 * 保额勾选Mapper接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface DInsuredMapper 
{
    /**
     * 查询保额勾选
     * 
     * @param insuredType 保额勾选主键
     * @return 保额勾选
     */
    public DInsured selectDInsuredByInsuredType(String insuredType);

    /**
     * 查询保额勾选列表
     * 
     * @param dInsured 保额勾选
     * @return 保额勾选集合
     */
    public List<DInsured> selectDInsuredList(DInsured dInsured);

    /**
     * 新增保额勾选
     * 
     * @param dInsured 保额勾选
     * @return 结果
     */
    public int insertDInsured(DInsured dInsured);

    /**
     * 修改保额勾选
     * 
     * @param dInsured 保额勾选
     * @return 结果
     */
    public int updateDInsured(DInsured dInsured);

    /**
     * 删除保额勾选
     * 
     * @param insuredType 保额勾选主键
     * @return 结果
     */
    public int deleteDInsuredByInsuredType(String insuredType);

    /**
     * 批量删除保额勾选
     * 
     * @param insuredTypes 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDInsuredByInsuredTypes(String[] insuredTypes);
}
