package com.ruoyi.project.fcbj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 险类-险种对象 d_product
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public class DProduct extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 投保险类 */
    @Excel(name = "投保险类")
    private String productType;

    /** 明细险种代码 */
    @Excel(name = "明细险种代码")
    private String productCode;

    /** 明细险种名称 */
    @Excel(name = "明细险种名称")
    private String productName;

    public void setProductType(String productType) 
    {
        this.productType = productType;
    }

    public String getProductType() 
    {
        return productType;
    }
    public void setProductCode(String productCode) 
    {
        this.productCode = productCode;
    }

    public String getProductCode() 
    {
        return productCode;
    }
    public void setProductName(String productName) 
    {
        this.productName = productName;
    }

    public String getProductName() 
    {
        return productName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("productType", getProductType())
            .append("productCode", getProductCode())
            .append("productName", getProductName())
            .toString();
    }
}
