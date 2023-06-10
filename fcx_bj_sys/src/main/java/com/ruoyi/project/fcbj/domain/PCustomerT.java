package com.ruoyi.project.fcbj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 客户信息对象 p_customer_t
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public class PCustomerT extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String rowId;

    /** vip代码 */
    @Excel(name = "vip代码")
    private String vipcode;

    /** 客户类型 */
    @Excel(name = "客户类型")
    private String customerType;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String customerName;

    /** 证件类型 */
    @Excel(name = "证件类型")
    private String credentialType;

    /** 证件号码 */
    @Excel(name = "证件号码")
    private String credentialNo;

    /** 电话 */
    @Excel(name = "电话")
    private String phone;

    /** 邮编 */
    @Excel(name = "邮编")
    private String zipcode;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String email;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 开户行 */
    @Excel(name = "开户行")
    private String bankCode;

    /** 银行账号 */
    @Excel(name = "银行账号")
    private String bankAccount;

    /** 法人代表 */
    @Excel(name = "法人代表")
    private String legalPerson;

    /** 行业类型 */
    @Excel(name = "行业类型")
    private String industryCode;

    /** 营业性质 */
    @Excel(name = "营业性质")
    private String businessCode;

    /** 联系人 */
    @Excel(name = "联系人")
    private String contacts;

    /** 联系人电话 */
    @Excel(name = "联系人电话")
    private String contactsPhone;

    public void setRowId(String rowId) 
    {
        this.rowId = rowId;
    }

    public String getRowId() 
    {
        return rowId;
    }
    public void setVipcode(String vipcode) 
    {
        this.vipcode = vipcode;
    }

    public String getVipcode() 
    {
        return vipcode;
    }
    public void setCustomerType(String customerType) 
    {
        this.customerType = customerType;
    }

    public String getCustomerType() 
    {
        return customerType;
    }
    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }

    public String getCustomerName() 
    {
        return customerName;
    }
    public void setCredentialType(String credentialType) 
    {
        this.credentialType = credentialType;
    }

    public String getCredentialType() 
    {
        return credentialType;
    }
    public void setCredentialNo(String credentialNo) 
    {
        this.credentialNo = credentialNo;
    }

    public String getCredentialNo() 
    {
        return credentialNo;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setZipcode(String zipcode) 
    {
        this.zipcode = zipcode;
    }

    public String getZipcode() 
    {
        return zipcode;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setBankCode(String bankCode) 
    {
        this.bankCode = bankCode;
    }

    public String getBankCode() 
    {
        return bankCode;
    }
    public void setBankAccount(String bankAccount) 
    {
        this.bankAccount = bankAccount;
    }

    public String getBankAccount() 
    {
        return bankAccount;
    }
    public void setLegalPerson(String legalPerson) 
    {
        this.legalPerson = legalPerson;
    }

    public String getLegalPerson() 
    {
        return legalPerson;
    }
    public void setIndustryCode(String industryCode) 
    {
        this.industryCode = industryCode;
    }

    public String getIndustryCode() 
    {
        return industryCode;
    }
    public void setBusinessCode(String businessCode) 
    {
        this.businessCode = businessCode;
    }

    public String getBusinessCode() 
    {
        return businessCode;
    }
    public void setContacts(String contacts) 
    {
        this.contacts = contacts;
    }

    public String getContacts() 
    {
        return contacts;
    }
    public void setContactsPhone(String contactsPhone) 
    {
        this.contactsPhone = contactsPhone;
    }

    public String getContactsPhone() 
    {
        return contactsPhone;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("rowId", getRowId())
            .append("vipcode", getVipcode())
            .append("customerType", getCustomerType())
            .append("customerName", getCustomerName())
            .append("credentialType", getCredentialType())
            .append("credentialNo", getCredentialNo())
            .append("phone", getPhone())
            .append("zipcode", getZipcode())
            .append("email", getEmail())
            .append("address", getAddress())
            .append("bankCode", getBankCode())
            .append("bankAccount", getBankAccount())
            .append("legalPerson", getLegalPerson())
            .append("industryCode", getIndustryCode())
            .append("businessCode", getBusinessCode())
            .append("contacts", getContacts())
            .append("contactsPhone", getContactsPhone())
            .toString();
    }
}
