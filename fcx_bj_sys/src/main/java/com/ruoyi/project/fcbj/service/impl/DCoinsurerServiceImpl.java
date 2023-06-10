package com.ruoyi.project.fcbj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.fcbj.mapper.DCoinsurerMapper;
import com.ruoyi.project.fcbj.domain.DCoinsurer;
import com.ruoyi.project.fcbj.service.IDCoinsurerService;

/**
 * 共保方式Service业务层处理
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Service
public class DCoinsurerServiceImpl implements IDCoinsurerService 
{
    @Autowired
    private DCoinsurerMapper dCoinsurerMapper;

    /**
     * 查询共保方式
     * 
     * @param coinsurerCode 共保方式主键
     * @return 共保方式
     */
    @Override
    public DCoinsurer selectDCoinsurerByCoinsurerCode(String coinsurerCode)
    {
        return dCoinsurerMapper.selectDCoinsurerByCoinsurerCode(coinsurerCode);
    }

    /**
     * 查询共保方式列表
     * 
     * @param dCoinsurer 共保方式
     * @return 共保方式
     */
    @Override
    public List<DCoinsurer> selectDCoinsurerList(DCoinsurer dCoinsurer)
    {
        return dCoinsurerMapper.selectDCoinsurerList(dCoinsurer);
    }

    /**
     * 新增共保方式
     * 
     * @param dCoinsurer 共保方式
     * @return 结果
     */
    @Override
    public int insertDCoinsurer(DCoinsurer dCoinsurer)
    {
        return dCoinsurerMapper.insertDCoinsurer(dCoinsurer);
    }

    /**
     * 修改共保方式
     * 
     * @param dCoinsurer 共保方式
     * @return 结果
     */
    @Override
    public int updateDCoinsurer(DCoinsurer dCoinsurer)
    {
        return dCoinsurerMapper.updateDCoinsurer(dCoinsurer);
    }

    /**
     * 批量删除共保方式
     * 
     * @param coinsurerCodes 需要删除的共保方式主键
     * @return 结果
     */
    @Override
    public int deleteDCoinsurerByCoinsurerCodes(String[] coinsurerCodes)
    {
        return dCoinsurerMapper.deleteDCoinsurerByCoinsurerCodes(coinsurerCodes);
    }

    /**
     * 删除共保方式信息
     * 
     * @param coinsurerCode 共保方式主键
     * @return 结果
     */
    @Override
    public int deleteDCoinsurerByCoinsurerCode(String coinsurerCode)
    {
        return dCoinsurerMapper.deleteDCoinsurerByCoinsurerCode(coinsurerCode);
    }
}
