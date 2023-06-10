package com.ruoyi.project.fcbj.service;

import java.util.List;
import com.ruoyi.project.fcbj.domain.DBusiness;

/**
 * 营业性质Service接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface IDBusinessService 
{
    /**
     * 查询营业性质
     * 
     * @param businessCode 营业性质主键
     * @return 营业性质
     */
    public DBusiness selectDBusinessByBusinessCode(String businessCode);

    /**
     * 查询营业性质列表
     * 
     * @param dBusiness 营业性质
     * @return 营业性质集合
     */
    public List<DBusiness> selectDBusinessList(DBusiness dBusiness);

    /**
     * 新增营业性质
     * 
     * @param dBusiness 营业性质
     * @return 结果
     */
    public int insertDBusiness(DBusiness dBusiness);

    /**
     * 修改营业性质
     * 
     * @param dBusiness 营业性质
     * @return 结果
     */
    public int updateDBusiness(DBusiness dBusiness);

    /**
     * 批量删除营业性质
     * 
     * @param businessCodes 需要删除的营业性质主键集合
     * @return 结果
     */
    public int deleteDBusinessByBusinessCodes(String[] businessCodes);

    /**
     * 删除营业性质信息
     * 
     * @param businessCode 营业性质主键
     * @return 结果
     */
    public int deleteDBusinessByBusinessCode(String businessCode);
}
