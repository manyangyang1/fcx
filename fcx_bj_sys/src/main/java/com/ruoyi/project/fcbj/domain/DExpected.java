package com.ruoyi.project.fcbj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 预期费用投放对象 d_expected
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public class DExpected extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 代码 */
    @Excel(name = "代码")
    private String expectedCode;

    /** 名称 */
    @Excel(name = "名称")
    private String expectedName;

    public void setExpectedCode(String expectedCode) 
    {
        this.expectedCode = expectedCode;
    }

    public String getExpectedCode() 
    {
        return expectedCode;
    }
    public void setExpectedName(String expectedName) 
    {
        this.expectedName = expectedName;
    }

    public String getExpectedName() 
    {
        return expectedName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("expectedCode", getExpectedCode())
            .append("expectedName", getExpectedName())
            .toString();
    }
}
