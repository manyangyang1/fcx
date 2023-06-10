package com.ruoyi.project.fcbj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 共保方式对象 d_coinsurer
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public class DCoinsurer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String coinsurerCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String coinsurerName;

    public void setCoinsurerCode(String coinsurerCode) 
    {
        this.coinsurerCode = coinsurerCode;
    }

    public String getCoinsurerCode() 
    {
        return coinsurerCode;
    }
    public void setCoinsurerName(String coinsurerName) 
    {
        this.coinsurerName = coinsurerName;
    }

    public String getCoinsurerName() 
    {
        return coinsurerName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("coinsurerCode", getCoinsurerCode())
            .append("coinsurerName", getCoinsurerName())
            .toString();
    }
}
