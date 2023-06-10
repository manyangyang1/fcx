package com.ruoyi.project.fcbj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.fcbj.mapper.DRydmMapper;
import com.ruoyi.project.fcbj.domain.DRydm;
import com.ruoyi.project.fcbj.service.IDRydmService;

/**
 * 人员代码Service业务层处理
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Service
public class DRydmServiceImpl implements IDRydmService 
{
    @Autowired
    private DRydmMapper dRydmMapper;

    /**
     * 查询人员代码
     * 
     * @param p13uid 人员代码主键
     * @return 人员代码
     */
    @Override
    public DRydm selectDRydmByP13uid(String p13uid)
    {
        return dRydmMapper.selectDRydmByP13uid(p13uid);
    }

    /**
     * 查询人员代码列表
     * 
     * @param dRydm 人员代码
     * @return 人员代码
     */
    @Override
    public List<DRydm> selectDRydmList(DRydm dRydm)
    {
        return dRydmMapper.selectDRydmList(dRydm);
    }

    /**
     * 新增人员代码
     * 
     * @param dRydm 人员代码
     * @return 结果
     */
    @Override
    public int insertDRydm(DRydm dRydm)
    {
        return dRydmMapper.insertDRydm(dRydm);
    }

    /**
     * 修改人员代码
     * 
     * @param dRydm 人员代码
     * @return 结果
     */
    @Override
    public int updateDRydm(DRydm dRydm)
    {
        return dRydmMapper.updateDRydm(dRydm);
    }

    /**
     * 批量删除人员代码
     * 
     * @param p13uids 需要删除的人员代码主键
     * @return 结果
     */
    @Override
    public int deleteDRydmByP13uids(String[] p13uids)
    {
        return dRydmMapper.deleteDRydmByP13uids(p13uids);
    }

    /**
     * 删除人员代码信息
     * 
     * @param p13uid 人员代码主键
     * @return 结果
     */
    @Override
    public int deleteDRydmByP13uid(String p13uid)
    {
        return dRydmMapper.deleteDRydmByP13uid(p13uid);
    }
}
