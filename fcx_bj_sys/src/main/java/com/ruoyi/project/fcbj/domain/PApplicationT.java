package com.ruoyi.project.fcbj.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * 申请单对象 p_application_t
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Data
public class PApplicationT extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String rowId;

    /** 录入人 */
    @Excel(name = "录入人")
    private String inputCode;

    /** 录入时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "录入时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date inputTime;

    /** 申报机构 */
    @Excel(name = "申报机构")
    private String departmentGroupCode;

    /** 申报人 */
    @Excel(name = "申报人")
    private String applicant;

    /** 申报时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申报时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applicationDate;

    /** 报价单编号 */
    @Excel(name = "报价单编号")
    private String applicationNo;

    /** 期望时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "期望时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date desireDate;

    /** 报价单状态 */
    @Excel(name = "报价单状态")
    private String status;

    /** 核保人 */
    @Excel(name = "核保人")
    private String underwriterCode;

    /** 核保开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "核保开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date underwriterStarttime;

    /** 核保结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "核保结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date underwriterEndtime;

    /** 核保意见 */
    @Excel(name = "核保意见")
    private String underwriteOpinion;

    /** 当前申请单版本号 */
    @Excel(name = "当前申请单版本号")
    private Long serialno;


}
