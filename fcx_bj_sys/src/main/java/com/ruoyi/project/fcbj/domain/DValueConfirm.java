package com.ruoyi.project.fcbj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 保险价值确定方式对象 d_value_confirm
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public class DValueConfirm extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 资产类型 */
    @Excel(name = "资产类型")
    private String propertyType;

    /** 保险价值确定方式 */
    @Excel(name = "保险价值确定方式")
    private String valueConfirm;

    public void setPropertyType(String propertyType) 
    {
        this.propertyType = propertyType;
    }

    public String getPropertyType() 
    {
        return propertyType;
    }
    public void setValueConfirm(String valueConfirm) 
    {
        this.valueConfirm = valueConfirm;
    }

    public String getValueConfirm() 
    {
        return valueConfirm;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("propertyType", getPropertyType())
            .append("valueConfirm", getValueConfirm())
            .toString();
    }
}
