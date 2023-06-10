package com.ruoyi.project.fcbj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.fcbj.mapper.PEnterprisePropertyTMapper;
import com.ruoyi.project.fcbj.domain.PEnterprisePropertyT;
import com.ruoyi.project.fcbj.service.IPEnterprisePropertyTService;

/**
 * 企财险报价主Service业务层处理
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Service
public class PEnterprisePropertyTServiceImpl implements IPEnterprisePropertyTService 
{
    @Autowired
    private PEnterprisePropertyTMapper pEnterprisePropertyTMapper;

    /**
     * 查询企财险报价主
     * 
     * @param rowId 企财险报价主主键
     * @return 企财险报价主
     */
    @Override
    public PEnterprisePropertyT selectPEnterprisePropertyTByRowId(String rowId)
    {
        return pEnterprisePropertyTMapper.selectPEnterprisePropertyTByRowId(rowId);
    }

    /**
     * 查询企财险报价主列表
     * 
     * @param pEnterprisePropertyT 企财险报价主
     * @return 企财险报价主
     */
    @Override
    public List<PEnterprisePropertyT> selectPEnterprisePropertyTList(PEnterprisePropertyT pEnterprisePropertyT)
    {
        return pEnterprisePropertyTMapper.selectPEnterprisePropertyTList(pEnterprisePropertyT);
    }

    /**
     * 新增企财险报价主
     * 
     * @param pEnterprisePropertyT 企财险报价主
     * @return 结果
     */
    @Override
    public int insertPEnterprisePropertyT(PEnterprisePropertyT pEnterprisePropertyT)
    {
        return pEnterprisePropertyTMapper.insertPEnterprisePropertyT(pEnterprisePropertyT);
    }

    /**
     * 修改企财险报价主
     * 
     * @param pEnterprisePropertyT 企财险报价主
     * @return 结果
     */
    @Override
    public int updatePEnterprisePropertyT(PEnterprisePropertyT pEnterprisePropertyT)
    {
        return pEnterprisePropertyTMapper.updatePEnterprisePropertyT(pEnterprisePropertyT);
    }

    /**
     * 批量删除企财险报价主
     * 
     * @param rowIds 需要删除的企财险报价主主键
     * @return 结果
     */
    @Override
    public int deletePEnterprisePropertyTByRowIds(String[] rowIds)
    {
        return pEnterprisePropertyTMapper.deletePEnterprisePropertyTByRowIds(rowIds);
    }

    /**
     * 删除企财险报价主信息
     * 
     * @param rowId 企财险报价主主键
     * @return 结果
     */
    @Override
    public int deletePEnterprisePropertyTByRowId(String rowId)
    {
        return pEnterprisePropertyTMapper.deletePEnterprisePropertyTByRowId(rowId);
    }
}
