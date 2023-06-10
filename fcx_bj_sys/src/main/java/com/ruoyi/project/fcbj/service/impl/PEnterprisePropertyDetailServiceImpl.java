package com.ruoyi.project.fcbj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.fcbj.mapper.PEnterprisePropertyDetailMapper;
import com.ruoyi.project.fcbj.domain.PEnterprisePropertyDetail;
import com.ruoyi.project.fcbj.service.IPEnterprisePropertyDetailService;

/**
 * 企财险报价明细Service业务层处理
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Service
public class PEnterprisePropertyDetailServiceImpl implements IPEnterprisePropertyDetailService 
{
    @Autowired
    private PEnterprisePropertyDetailMapper pEnterprisePropertyDetailMapper;

    /**
     * 查询企财险报价明细
     * 
     * @param rowId 企财险报价明细主键
     * @return 企财险报价明细
     */
    @Override
    public PEnterprisePropertyDetail selectPEnterprisePropertyDetailByRowId(String rowId)
    {
        return pEnterprisePropertyDetailMapper.selectPEnterprisePropertyDetailByRowId(rowId);
    }

    /**
     * 查询企财险报价明细列表
     * 
     * @param pEnterprisePropertyDetail 企财险报价明细
     * @return 企财险报价明细
     */
    @Override
    public List<PEnterprisePropertyDetail> selectPEnterprisePropertyDetailList(PEnterprisePropertyDetail pEnterprisePropertyDetail)
    {
        return pEnterprisePropertyDetailMapper.selectPEnterprisePropertyDetailList(pEnterprisePropertyDetail);
    }

    /**
     * 新增企财险报价明细
     * 
     * @param pEnterprisePropertyDetail 企财险报价明细
     * @return 结果
     */
    @Override
    public int insertPEnterprisePropertyDetail(PEnterprisePropertyDetail pEnterprisePropertyDetail)
    {
        return pEnterprisePropertyDetailMapper.insertPEnterprisePropertyDetail(pEnterprisePropertyDetail);
    }

    /**
     * 修改企财险报价明细
     * 
     * @param pEnterprisePropertyDetail 企财险报价明细
     * @return 结果
     */
    @Override
    public int updatePEnterprisePropertyDetail(PEnterprisePropertyDetail pEnterprisePropertyDetail)
    {
        return pEnterprisePropertyDetailMapper.updatePEnterprisePropertyDetail(pEnterprisePropertyDetail);
    }

    /**
     * 批量删除企财险报价明细
     * 
     * @param rowIds 需要删除的企财险报价明细主键
     * @return 结果
     */
    @Override
    public int deletePEnterprisePropertyDetailByRowIds(String[] rowIds)
    {
        return pEnterprisePropertyDetailMapper.deletePEnterprisePropertyDetailByRowIds(rowIds);
    }

    /**
     * 删除企财险报价明细信息
     * 
     * @param rowId 企财险报价明细主键
     * @return 结果
     */
    @Override
    public int deletePEnterprisePropertyDetailByRowId(String rowId)
    {
        return pEnterprisePropertyDetailMapper.deletePEnterprisePropertyDetailByRowId(rowId);
    }
}
