package com.ruoyi.project.fcbj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 客群对象 d_customerdept
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public class DCustomerdept extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 客群代码 */
    @Excel(name = "客群代码")
    private String customerdept;

    /** 客群 */
    @Excel(name = "客群")
    private String kqname;

    public void setCustomerdept(String customerdept) 
    {
        this.customerdept = customerdept;
    }

    public String getCustomerdept() 
    {
        return customerdept;
    }
    public void setKqname(String kqname) 
    {
        this.kqname = kqname;
    }

    public String getKqname() 
    {
        return kqname;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("customerdept", getCustomerdept())
            .append("kqname", getKqname())
            .toString();
    }
}
