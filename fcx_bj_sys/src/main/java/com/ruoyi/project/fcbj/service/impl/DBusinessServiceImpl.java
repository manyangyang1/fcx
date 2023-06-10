package com.ruoyi.project.fcbj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.fcbj.mapper.DBusinessMapper;
import com.ruoyi.project.fcbj.domain.DBusiness;
import com.ruoyi.project.fcbj.service.IDBusinessService;

/**
 * 营业性质Service业务层处理
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Service
public class DBusinessServiceImpl implements IDBusinessService 
{
    @Autowired
    private DBusinessMapper dBusinessMapper;

    /**
     * 查询营业性质
     * 
     * @param businessCode 营业性质主键
     * @return 营业性质
     */
    @Override
    public DBusiness selectDBusinessByBusinessCode(String businessCode)
    {
        return dBusinessMapper.selectDBusinessByBusinessCode(businessCode);
    }

    /**
     * 查询营业性质列表
     * 
     * @param dBusiness 营业性质
     * @return 营业性质
     */
    @Override
    public List<DBusiness> selectDBusinessList(DBusiness dBusiness)
    {
        return dBusinessMapper.selectDBusinessList(dBusiness);
    }

    /**
     * 新增营业性质
     * 
     * @param dBusiness 营业性质
     * @return 结果
     */
    @Override
    public int insertDBusiness(DBusiness dBusiness)
    {
        return dBusinessMapper.insertDBusiness(dBusiness);
    }

    /**
     * 修改营业性质
     * 
     * @param dBusiness 营业性质
     * @return 结果
     */
    @Override
    public int updateDBusiness(DBusiness dBusiness)
    {
        return dBusinessMapper.updateDBusiness(dBusiness);
    }

    /**
     * 批量删除营业性质
     * 
     * @param businessCodes 需要删除的营业性质主键
     * @return 结果
     */
    @Override
    public int deleteDBusinessByBusinessCodes(String[] businessCodes)
    {
        return dBusinessMapper.deleteDBusinessByBusinessCodes(businessCodes);
    }

    /**
     * 删除营业性质信息
     * 
     * @param businessCode 营业性质主键
     * @return 结果
     */
    @Override
    public int deleteDBusinessByBusinessCode(String businessCode)
    {
        return dBusinessMapper.deleteDBusinessByBusinessCode(businessCode);
    }
}
