package com.ruoyi.project.fcbj.mapper;

import java.util.List;
import com.ruoyi.project.fcbj.domain.DBusiness;

/**
 * 营业性质Mapper接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface DBusinessMapper 
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
     * 删除营业性质
     * 
     * @param businessCode 营业性质主键
     * @return 结果
     */
    public int deleteDBusinessByBusinessCode(String businessCode);

    /**
     * 批量删除营业性质
     * 
     * @param businessCodes 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDBusinessByBusinessCodes(String[] businessCodes);
}
