package com.ruoyi.project.fcbj.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * 企财险报价明细对象 p_enterprise_property_detail
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Data
public class PEnterprisePropertyDetail extends BaseEntity
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

    /** 风勘编号 */
    @Excel(name = "风勘编号")
    private String risksurveyNo;

    /** 被保险人营业性质 */
    @Excel(name = "被保险人营业性质")
    private String businessCode;

    /** 标的地址 */
    @Excel(name = "标的地址")
    private String address;

    /** 被保险人投产时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "被保险人投产时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date operationDate;

    /** 总保额 */
    @Excel(name = "总保额")
    private Long totalInsuredAmount;

    /** 起保日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "起保日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date inceptionDate;

    /** 终止日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "终止日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date plannedEndDate;

    /** 纯风险报价单号 */
    @Excel(name = "纯风险报价单号")
    private String priskinducode;

    /** 保险金额确定方式 */
    @Excel(name = "保险金额确定方式")
    private String insuredamountConfirm;

    /** 保险价值确定方式 */
    @Excel(name = "保险价值确定方式")
    private String insuredvalueConfirm;

    /** 其他标的风险描述 */
    @Excel(name = "其他标的风险描述")
    private String othersRisk;

    /** 免赔 */
    @Excel(name = "免赔")
    private String deductible;

    /** 支付方式 */
    @Excel(name = "支付方式")
    private String paykind;

    /** 总保费 */
    @Excel(name = "总保费")
    private Long totalPremiumAmount;

    /** 适用条款/附加条款 */
    @Excel(name = "适用条款/附加条款")
    private String classesitem;

    /** 特别约定 */
    @Excel(name = "特别约定")
    private String specialStipulation;

    /** 预期费用投放 */
    @Excel(name = "预期费用投放")
    private String expectedExpenses;

    /** 非标准费用明细需求 */
    @Excel(name = "非标准费用明细需求")
    private String otherDemands;

    /** 涉及关联业务 */
    @Excel(name = "涉及关联业务")
    private String associatedBusiness;

    /** 核保意见 */
    @Excel(name = "核保意见")
    private String underwriteOpinion;

    /** 备注 */
    @Excel(name = "备注")
    private String notes;

    /** 太保分测试号 */
    @Excel(name = "太保分测试号")
    private String tbfNo;

    /** 太保分 */
    @Excel(name = "太保分")
    private double tbf;

}
