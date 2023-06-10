package com.ruoyi.project.fcbj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 营业性质对象 d_business
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public class DBusiness extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 营业性质代码 */
    @Excel(name = "营业性质代码")
    private String businessCode;

    /** 营业性质名称 */
    @Excel(name = "营业性质名称")
    private String businessName;

    public void setBusinessCode(String businessCode) 
    {
        this.businessCode = businessCode;
    }

    public String getBusinessCode() 
    {
        return businessCode;
    }
    public void setBusinessName(String businessName) 
    {
        this.businessName = businessName;
    }

    public String getBusinessName() 
    {
        return businessName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("businessCode", getBusinessCode())
            .append("businessName", getBusinessName())
            .toString();
    }
}
