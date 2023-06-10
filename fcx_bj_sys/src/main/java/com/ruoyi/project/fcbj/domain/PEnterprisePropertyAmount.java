package com.ruoyi.project.fcbj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 企财险保额对象 p_enterprise_property_amount
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public class PEnterprisePropertyAmount extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String rowId;

    /** 报价单编号 */
    @Excel(name = "报价单编号")
    private String applicationNo;

    /** 版本号 */
    @Excel(name = "版本号")
    private Long serialno;

    /** 标的序号 */
    @Excel(name = "标的序号")
    private String amountCode;

    /** 资产类型 */
    @Excel(name = "资产类型")
    private String insuredType;

    /** 承保标的项目 */
    @Excel(name = "承保标的项目")
    private String insuredName;

    /** 保额 */
    @Excel(name = "保额")
    private Long insuredAmount;

    /** 保险金额确定方式 */
    @Excel(name = "保险金额确定方式")
    private String amountConfirm;

    /** 保险价值确定方式 */
    @Excel(name = "保险价值确定方式")
    private String valueConfirm;

    /** 申请费率 */
    @Excel(name = "申请费率")
    private Long feeRate;

    /** 核保费率 */
    @Excel(name = "核保费率")
    private Long feeRateAudit;

    /** 地址序号 */
    @Excel(name = "地址序号")
    private String addressNo;

    /** 保费 */
    @Excel(name = "保费")
    private Long premiumAmount;

    public void setRowId(String rowId) 
    {
        this.rowId = rowId;
    }

    public String getRowId() 
    {
        return rowId;
    }
    public void setApplicationNo(String applicationNo) 
    {
        this.applicationNo = applicationNo;
    }

    public String getApplicationNo() 
    {
        return applicationNo;
    }
    public void setSerialno(Long serialno) 
    {
        this.serialno = serialno;
    }

    public Long getSerialno() 
    {
        return serialno;
    }
    public void setAmountCode(String amountCode) 
    {
        this.amountCode = amountCode;
    }

    public String getAmountCode() 
    {
        return amountCode;
    }
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
    public void setInsuredAmount(Long insuredAmount) 
    {
        this.insuredAmount = insuredAmount;
    }

    public Long getInsuredAmount() 
    {
        return insuredAmount;
    }
    public void setAmountConfirm(String amountConfirm) 
    {
        this.amountConfirm = amountConfirm;
    }

    public String getAmountConfirm() 
    {
        return amountConfirm;
    }
    public void setValueConfirm(String valueConfirm) 
    {
        this.valueConfirm = valueConfirm;
    }

    public String getValueConfirm() 
    {
        return valueConfirm;
    }
    public void setFeeRate(Long feeRate) 
    {
        this.feeRate = feeRate;
    }

    public Long getFeeRate() 
    {
        return feeRate;
    }
    public void setFeeRateAudit(Long feeRateAudit) 
    {
        this.feeRateAudit = feeRateAudit;
    }

    public Long getFeeRateAudit() 
    {
        return feeRateAudit;
    }
    public void setAddressNo(String addressNo) 
    {
        this.addressNo = addressNo;
    }

    public String getAddressNo() 
    {
        return addressNo;
    }
    public void setPremiumAmount(Long premiumAmount) 
    {
        this.premiumAmount = premiumAmount;
    }

    public Long getPremiumAmount() 
    {
        return premiumAmount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("rowId", getRowId())
            .append("applicationNo", getApplicationNo())
            .append("serialno", getSerialno())
            .append("amountCode", getAmountCode())
            .append("insuredType", getInsuredType())
            .append("insuredName", getInsuredName())
            .append("insuredAmount", getInsuredAmount())
            .append("amountConfirm", getAmountConfirm())
            .append("valueConfirm", getValueConfirm())
            .append("feeRate", getFeeRate())
            .append("feeRateAudit", getFeeRateAudit())
            .append("addressNo", getAddressNo())
            .append("premiumAmount", getPremiumAmount())
            .toString();
    }
}
