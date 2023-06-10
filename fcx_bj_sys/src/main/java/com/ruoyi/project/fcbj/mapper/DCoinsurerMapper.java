package com.ruoyi.project.fcbj.mapper;

import java.util.List;
import com.ruoyi.project.fcbj.domain.DCoinsurer;

/**
 * 共保方式Mapper接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface DCoinsurerMapper 
{
    /**
     * 查询共保方式
     * 
     * @param coinsurerCode 共保方式主键
     * @return 共保方式
     */
    public DCoinsurer selectDCoinsurerByCoinsurerCode(String coinsurerCode);

    /**
     * 查询共保方式列表
     * 
     * @param dCoinsurer 共保方式
     * @return 共保方式集合
     */
    public List<DCoinsurer> selectDCoinsurerList(DCoinsurer dCoinsurer);

    /**
     * 新增共保方式
     * 
     * @param dCoinsurer 共保方式
     * @return 结果
     */
    public int insertDCoinsurer(DCoinsurer dCoinsurer);

    /**
     * 修改共保方式
     * 
     * @param dCoinsurer 共保方式
     * @return 结果
     */
    public int updateDCoinsurer(DCoinsurer dCoinsurer);

    /**
     * 删除共保方式
     * 
     * @param coinsurerCode 共保方式主键
     * @return 结果
     */
    public int deleteDCoinsurerByCoinsurerCode(String coinsurerCode);

    /**
     * 批量删除共保方式
     * 
     * @param coinsurerCodes 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDCoinsurerByCoinsurerCodes(String[] coinsurerCodes);
}
