package com.ruoyi.project.fcbj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 保额勾选对象 d_insured
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public class DInsured extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 资产类型 */
    @Excel(name = "资产类型")
    private String insuredType;

    /** 承保标的项目 */
    @Excel(name = "承保标的项目")
    private String insuredName;

    public void setInsuredType(String insuredType) 
    {
        this.insuredType = insuredType;
    }

    public String getInsuredType() 
    {
        return insuredType;
    }
    public void setInsuredName(String insuredName) 
    {
        this.insuredName = insuredName;
    }

    public String getInsuredName() 
    {
        return insuredName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("insuredType", getInsuredType())
            .append("insuredName", getInsuredName())
            .toString();
    }
}
