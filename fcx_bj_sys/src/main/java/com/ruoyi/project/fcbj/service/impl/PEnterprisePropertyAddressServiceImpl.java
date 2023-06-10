package com.ruoyi.project.fcbj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.fcbj.mapper.PEnterprisePropertyAddressMapper;
import com.ruoyi.project.fcbj.domain.PEnterprisePropertyAddress;
import com.ruoyi.project.fcbj.service.IPEnterprisePropertyAddressService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Service
public class PEnterprisePropertyAddressServiceImpl implements IPEnterprisePropertyAddressService 
{
    @Autowired
    private PEnterprisePropertyAddressMapper pEnterprisePropertyAddressMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param rowId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public PEnterprisePropertyAddress selectPEnterprisePropertyAddressByRowId(String rowId)
    {
        return pEnterprisePropertyAddressMapper.selectPEnterprisePropertyAddressByRowId(rowId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param pEnterprisePropertyAddress 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<PEnterprisePropertyAddress> selectPEnterprisePropertyAddressList(PEnterprisePropertyAddress pEnterprisePropertyAddress)
    {
        return pEnterprisePropertyAddressMapper.selectPEnterprisePropertyAddressList(pEnterprisePropertyAddress);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param pEnterprisePropertyAddress 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertPEnterprisePropertyAddress(PEnterprisePropertyAddress pEnterprisePropertyAddress)
    {
        return pEnterprisePropertyAddressMapper.insertPEnterprisePropertyAddress(pEnterprisePropertyAddress);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param pEnterprisePropertyAddress 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updatePEnterprisePropertyAddress(PEnterprisePropertyAddress pEnterprisePropertyAddress)
    {
        return pEnterprisePropertyAddressMapper.updatePEnterprisePropertyAddress(pEnterprisePropertyAddress);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param rowIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePEnterprisePropertyAddressByRowIds(String[] rowIds)
    {
        return pEnterprisePropertyAddressMapper.deletePEnterprisePropertyAddressByRowIds(rowIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param rowId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePEnterprisePropertyAddressByRowId(String rowId)
    {
        return pEnterprisePropertyAddressMapper.deletePEnterprisePropertyAddressByRowId(rowId);
    }
}
