package com.ruoyi.project.fcbj.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * 企财险报价主对象 p_enterprise_property_t
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Data
public class PEnterprisePropertyT extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String rowId;

    /** 报价单编号 */
    @Excel(name = "报价单编号")
    private String applicationNo;

    /** 投保人 */
    @Excel(name = "投保人")
    private String applyName;

    /** 被保人 */
    @Excel(name = "被保人")
    private String insuredName;

    /** 落地经办部门 */
    @Excel(name = "落地经办部门")
    private String departmentCode;

    /** 项目预计规模 */
    @Excel(name = "项目预计规模")
    private Long insuredAmount;

    /** 预计项目起保日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预计项目起保日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date expectedInceptiondate;

    /** 是否招投标业务 */
    @Excel(name = "是否招投标业务")
    private String isInvite;

    /** 投保险类 */
    @Excel(name = "投保险类")
    private String productType;

    /** 明细险种 */
    @Excel(name = "明细险种")
    private String productCode;

    /** 客群分类 */
    @Excel(name = "客群分类")
    private String customerdept;

    /** 是否续保 */
    @Excel(name = "是否续保")
    private String ifcontinued;

    /** 续保单号 */
    @Excel(name = "续保单号")
    private String previouspolicyno;

    /** 共保方式 */
    @Excel(name = "共保方式")
    private String coinsuranceIndicator;

    /** 我司承保份额 */
    @Excel(name = "我司承保份额")
    private double copercent;

    /** 项目过往承保方 */
    @Excel(name = "项目过往承保方")
    private String prevCompany;

    /** 历年业务规模 */
    @Excel(name = "历年业务规模")
    private String historyInsurance;

    /** 历史赔付情况 */
    @Excel(name = "历史赔付情况")
    private String historyPayment;

    /** 业务来源 */
    @Excel(name = "业务来源")
    private String sellingChannel;

    /** 同业竞争情况 */
    @Excel(name = "同业竞争情况")
    private String industryInformation;

    /** 其他潜在业务 */
    @Excel(name = "其他潜在业务")
    private String othersInformation;

    /** 附件 */
    @Excel(name = "附件")
    private String annex;

}
