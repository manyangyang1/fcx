package com.ruoyi.project.fcbj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 人员代码对象 d_rydm
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public class DRydm extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 人员代码 */
    @Excel(name = "人员代码")
    private String p13uid;

    /** 人员归属机构 */
    @Excel(name = "人员归属机构")
    private String sectionOfficeCode;

    public void setP13uid(String p13uid) 
    {
        this.p13uid = p13uid;
    }

    public String getP13uid() 
    {
        return p13uid;
    }
    public void setSectionOfficeCode(String sectionOfficeCode) 
    {
        this.sectionOfficeCode = sectionOfficeCode;
    }

    public String getSectionOfficeCode() 
    {
        return sectionOfficeCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("p13uid", getP13uid())
            .append("sectionOfficeCode", getSectionOfficeCode())
            .toString();
    }
}
