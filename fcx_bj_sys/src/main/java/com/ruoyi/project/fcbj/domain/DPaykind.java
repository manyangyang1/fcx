package com.ruoyi.project.fcbj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 支付方式对象 d_paykind
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public class DPaykind extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 方式代码 */
    @Excel(name = "方式代码")
    private String paycode;

    /** 方式名称 */
    @Excel(name = "方式名称")
    private String payname;

    public void setPaycode(String paycode) 
    {
        this.paycode = paycode;
    }

    public String getPaycode() 
    {
        return paycode;
    }
    public void setPayname(String payname) 
    {
        this.payname = payname;
    }

    public String getPayname() 
    {
        return payname;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("paycode", getPaycode())
            .append("payname", getPayname())
            .toString();
    }
}
