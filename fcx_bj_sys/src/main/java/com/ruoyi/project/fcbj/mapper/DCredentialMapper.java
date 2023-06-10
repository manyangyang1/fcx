package com.ruoyi.project.fcbj.mapper;

import java.util.List;
import com.ruoyi.project.fcbj.domain.DCredential;

/**
 * 证件类型Mapper接口
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public interface DCredentialMapper 
{
    /**
     * 查询证件类型
     * 
     * @param credentialCode 证件类型主键
     * @return 证件类型
     */
    public DCredential selectDCredentialByCredentialCode(String credentialCode);

    /**
     * 查询证件类型列表
     * 
     * @param dCredential 证件类型
     * @return 证件类型集合
     */
    public List<DCredential> selectDCredentialList(DCredential dCredential);

    /**
     * 新增证件类型
     * 
     * @param dCredential 证件类型
     * @return 结果
     */
    public int insertDCredential(DCredential dCredential);

    /**
     * 修改证件类型
     * 
     * @param dCredential 证件类型
     * @return 结果
     */
    public int updateDCredential(DCredential dCredential);

    /**
     * 删除证件类型
     * 
     * @param credentialCode 证件类型主键
     * @return 结果
     */
    public int deleteDCredentialByCredentialCode(String credentialCode);

    /**
     * 批量删除证件类型
     * 
     * @param credentialCodes 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDCredentialByCredentialCodes(String[] credentialCodes);
}
