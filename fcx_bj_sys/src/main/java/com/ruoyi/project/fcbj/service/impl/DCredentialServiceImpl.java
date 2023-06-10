package com.ruoyi.project.fcbj.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.fcbj.mapper.DCredentialMapper;
import com.ruoyi.project.fcbj.domain.DCredential;
import com.ruoyi.project.fcbj.service.IDCredentialService;

/**
 * 证件类型Service业务层处理
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Service
public class DCredentialServiceImpl implements IDCredentialService 
{
    @Autowired
    private DCredentialMapper dCredentialMapper;

    /**
     * 查询证件类型
     * 
     * @param credentialCode 证件类型主键
     * @return 证件类型
     */
    @Override
    public DCredential selectDCredentialByCredentialCode(String credentialCode)
    {
        return dCredentialMapper.selectDCredentialByCredentialCode(credentialCode);
    }

    /**
     * 查询证件类型列表
     * 
     * @param dCredential 证件类型
     * @return 证件类型
     */
    @Override
    public List<DCredential> selectDCredentialList(DCredential dCredential)
    {
        return dCredentialMapper.selectDCredentialList(dCredential);
    }

    /**
     * 新增证件类型
     * 
     * @param dCredential 证件类型
     * @return 结果
     */
    @Override
    public int insertDCredential(DCredential dCredential)
    {
        return dCredentialMapper.insertDCredential(dCredential);
    }

    /**
     * 修改证件类型
     * 
     * @param dCredential 证件类型
     * @return 结果
     */
    @Override
    public int updateDCredential(DCredential dCredential)
    {
        return dCredentialMapper.updateDCredential(dCredential);
    }

    /**
     * 批量删除证件类型
     * 
     * @param credentialCodes 需要删除的证件类型主键
     * @return 结果
     */
    @Override
    public int deleteDCredentialByCredentialCodes(String[] credentialCodes)
    {
        return dCredentialMapper.deleteDCredentialByCredentialCodes(credentialCodes);
    }

    /**
     * 删除证件类型信息
     * 
     * @param credentialCode 证件类型主键
     * @return 结果
     */
    @Override
    public int deleteDCredentialByCredentialCode(String credentialCode)
    {
        return dCredentialMapper.deleteDCredentialByCredentialCode(credentialCode);
    }
}
