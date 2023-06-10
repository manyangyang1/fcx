package com.ruoyi.project.fcbj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 证件类型对象 d_credential
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public class DCredential extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 证件代码 */
    @Excel(name = "证件代码")
    private String credentialCode;

    /** 证件名称 */
    @Excel(name = "证件名称")
    private String credentialName;

    public void setCredentialCode(String credentialCode) 
    {
        this.credentialCode = credentialCode;
    }

    public String getCredentialCode() 
    {
        return credentialCode;
    }
    public void setCredentialName(String credentialName) 
    {
        this.credentialName = credentialName;
    }

    public String getCredentialName() 
    {
        return credentialName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("credentialCode", getCredentialCode())
            .append("credentialName", getCredentialName())
            .toString();
    }
}
