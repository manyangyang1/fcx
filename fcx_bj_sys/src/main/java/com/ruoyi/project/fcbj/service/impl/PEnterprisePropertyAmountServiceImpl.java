package com.ruoyi.project.fcbj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.fcbj.mapper.PEnterprisePropertyAmountMapper;
import com.ruoyi.project.fcbj.domain.PEnterprisePropertyAmount;
import com.ruoyi.project.fcbj.service.IPEnterprisePropertyAmountService;

/**
 * 企财险保额Service业务层处理
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Service
public class PEnterprisePropertyAmountServiceImpl implements IPEnterprisePropertyAmountService 
{
    @Autowired
    private PEnterprisePropertyAmountMapper pEnterprisePropertyAmountMapper;

    /**
     * 查询企财险保额
     * 
     * @param rowId 企财险保额主键
     * @return 企财险保额
     */
    @Override
    public PEnterprisePropertyAmount selectPEnterprisePropertyAmountByRowId(String rowId)
    {
        return pEnterprisePropertyAmountMapper.selectPEnterprisePropertyAmountByRowId(rowId);
    }

    /**
     * 查询企财险保额列表
     * 
     * @param pEnterprisePropertyAmount 企财险保额
     * @return 企财险保额
     */
    @Override
    public List<PEnterprisePropertyAmount> selectPEnterprisePropertyAmountList(PEnterprisePropertyAmount pEnterprisePropertyAmount)
    {
        return pEnterprisePropertyAmountMapper.selectPEnterprisePropertyAmountList(pEnterprisePropertyAmount);
    }

    /**
     * 新增企财险保额
     * 
     * @param pEnterprisePropertyAmount 企财险保额
     * @return 结果
     */
    @Override
    public int insertPEnterprisePropertyAmount(PEnterprisePropertyAmount pEnterprisePropertyAmount)
    {
        return pEnterprisePropertyAmountMapper.insertPEnterprisePropertyAmount(pEnterprisePropertyAmount);
    }

    /**
     * 修改企财险保额
     * 
     * @param pEnterprisePropertyAmount 企财险保额
     * @return 结果
     */
    @Override
    public int updatePEnterprisePropertyAmount(PEnterprisePropertyAmount pEnterprisePropertyAmount)
    {
        return pEnterprisePropertyAmountMapper.updatePEnterprisePropertyAmount(pEnterprisePropertyAmount);
    }

    /**
     * 批量删除企财险保额
     * 
     * @param rowIds 需要删除的企财险保额主键
     * @return 结果
     */
    @Override
    public int deletePEnterprisePropertyAmountByRowIds(String[] rowIds)
    {
        return pEnterprisePropertyAmountMapper.deletePEnterprisePropertyAmountByRowIds(rowIds);
    }

    /**
     * 删除企财险保额信息
     * 
     * @param rowId 企财险保额主键
     * @return 结果
     */
    @Override
    public int deletePEnterprisePropertyAmountByRowId(String rowId)
    {
        return pEnterprisePropertyAmountMapper.deletePEnterprisePropertyAmountByRowId(rowId);
    }
}
