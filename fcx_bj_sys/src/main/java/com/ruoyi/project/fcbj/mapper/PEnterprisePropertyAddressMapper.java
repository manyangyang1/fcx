package com.ruoyi.project.fcbj.mapper;

import java.util.List;
import com.ruoyi.project.fcbj.domain.PEnterprisePropertyAddress;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface PEnterprisePropertyAddressMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param rowId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public PEnterprisePropertyAddress selectPEnterprisePropertyAddressByRowId(String rowId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param pEnterprisePropertyAddress 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<PEnterprisePropertyAddress> selectPEnterprisePropertyAddressList(PEnterprisePropertyAddress pEnterprisePropertyAddress);

    /**
     * 新增【请填写功能名称】
     * 
     * @param pEnterprisePropertyAddress 【请填写功能名称】
     * @return 结果
     */
    public int insertPEnterprisePropertyAddress(PEnterprisePropertyAddress pEnterprisePropertyAddress);

    /**
     * 修改【请填写功能名称】
     * 
     * @param pEnterprisePropertyAddress 【请填写功能名称】
     * @return 结果
     */
    public int updatePEnterprisePropertyAddress(PEnterprisePropertyAddress pEnterprisePropertyAddress);

    /**
     * 删除【请填写功能名称】
     * 
     * @param rowId 【请填写功能名称】主键
     * @return 结果
     */
    public int deletePEnterprisePropertyAddressByRowId(String rowId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param rowIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePEnterprisePropertyAddressByRowIds(String[] rowIds);
}
