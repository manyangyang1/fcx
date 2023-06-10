package com.ruoyi.project.fcbj.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.Data;

/**
 * 【请填写功能名称】对象 p_enterprise_property_address
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@Data
public class PEnterprisePropertyAddress extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String rowId;

    /** 申请单号 */
    @Excel(name = "申请单号")
    private String applicationNo;

    /** 版本号 */
    @Excel(name = "版本号")
    private Long serialno;

    /** 标的序号 */
    @Excel(name = "标的序号")
    private Long addressNo;

    /** 标的地址 */
    @Excel(name = "标的地址")
    private String addressDetail;

    /** 是否主地址 */
    @Excel(name = "是否主地址")
    private String isMain;

    /** 合计保额 */
    @Excel(name = "合计保额")
    private double insuredAmount;

    /** 合计保费 */
    @Excel(name = "合计保费")
    private double premiumAmount;

}
