package com.ruoyi.project.fcbj.mapper;

import java.util.List;
import com.ruoyi.project.fcbj.domain.DUnit;

/**
 * 机构代码Mapper接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface DUnitMapper 
{
    /**
     * 查询机构代码
     * 
     * @param xh 机构代码主键
     * @return 机构代码
     */
    public DUnit selectDUnitByXh(Long xh);

    /**
     * 查询机构代码列表
     * 
     * @param dUnit 机构代码
     * @return 机构代码集合
     */
    public List<DUnit> selectDUnitList(DUnit dUnit);

    /**
     * 新增机构代码
     * 
     * @param dUnit 机构代码
     * @return 结果
     */
    public int insertDUnit(DUnit dUnit);

    /**
     * 修改机构代码
     * 
     * @param dUnit 机构代码
     * @return 结果
     */
    public int updateDUnit(DUnit dUnit);

    /**
     * 删除机构代码
     * 
     * @param xh 机构代码主键
     * @return 结果
     */
    public int deleteDUnitByXh(Long xh);

    /**
     * 批量删除机构代码
     * 
     * @param xhs 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDUnitByXhs(Long[] xhs);
}
