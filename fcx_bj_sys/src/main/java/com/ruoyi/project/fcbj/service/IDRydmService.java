package com.ruoyi.project.fcbj.service;

import java.util.List;
import com.ruoyi.project.fcbj.domain.DRydm;

/**
 * 人员代码Service接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface IDRydmService 
{
    /**
     * 查询人员代码
     * 
     * @param p13uid 人员代码主键
     * @return 人员代码
     */
    public DRydm selectDRydmByP13uid(String p13uid);

    /**
     * 查询人员代码列表
     * 
     * @param dRydm 人员代码
     * @return 人员代码集合
     */
    public List<DRydm> selectDRydmList(DRydm dRydm);

    /**
     * 新增人员代码
     * 
     * @param dRydm 人员代码
     * @return 结果
     */
    public int insertDRydm(DRydm dRydm);

    /**
     * 修改人员代码
     * 
     * @param dRydm 人员代码
     * @return 结果
     */
    public int updateDRydm(DRydm dRydm);

    /**
     * 批量删除人员代码
     * 
     * @param p13uids 需要删除的人员代码主键集合
     * @return 结果
     */
    public int deleteDRydmByP13uids(String[] p13uids);

    /**
     * 删除人员代码信息
     * 
     * @param p13uid 人员代码主键
     * @return 结果
     */
    public int deleteDRydmByP13uid(String p13uid);
}
