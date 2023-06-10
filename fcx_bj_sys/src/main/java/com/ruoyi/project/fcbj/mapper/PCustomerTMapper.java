package com.ruoyi.project.fcbj.mapper;

import java.util.List;
import com.ruoyi.project.fcbj.domain.PCustomerT;

/**
 * 客户信息Mapper接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface PCustomerTMapper 
{
    /**
     * 查询客户信息
     * 
     * @param rowId 客户信息主键
     * @return 客户信息
     */
    public PCustomerT selectPCustomerTByRowId(String rowId);

    /**
     * 查询客户信息列表
     * 
     * @param pCustomerT 客户信息
     * @return 客户信息集合
     */
    public List<PCustomerT> selectPCustomerTList(PCustomerT pCustomerT);

    /**
     * 新增客户信息
     * 
     * @param pCustomerT 客户信息
     * @return 结果
     */
    public int insertPCustomerT(PCustomerT pCustomerT);

    /**
     * 修改客户信息
     * 
     * @param pCustomerT 客户信息
     * @return 结果
     */
    public int updatePCustomerT(PCustomerT pCustomerT);

    /**
     * 删除客户信息
     * 
     * @param rowId 客户信息主键
     * @return 结果
     */
    public int deletePCustomerTByRowId(String rowId);

    /**
     * 批量删除客户信息
     * 
     * @param rowIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePCustomerTByRowIds(String[] rowIds);
}
