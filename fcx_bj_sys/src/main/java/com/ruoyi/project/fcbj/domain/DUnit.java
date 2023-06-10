package com.ruoyi.project.fcbj.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 机构代码对象 d_unit
 * 
 * @author gxcx
 * @date 2023-06-09
 */
public class DUnit extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 展示序号 */
    @Excel(name = "展示序号")
    private Long xh;

    /** 机构 */
    @Excel(name = "机构")
    private String bmz;

    /** 部门代码 */
    @Excel(name = "部门代码")
    private String bmdm;

    /** 部门名称 */
    @Excel(name = "部门名称")
    private String bmmc;

    /** 科室代码 */
    @Excel(name = "科室代码")
    private String kshdm;

    /** 科室名称 */
    @Excel(name = "科室名称")
    private String kshmc;

    public void setXh(Long xh) 
    {
        this.xh = xh;
    }

    public Long getXh() 
    {
        return xh;
    }
    public void setBmz(String bmz) 
    {
        this.bmz = bmz;
    }

    public String getBmz() 
    {
        return bmz;
    }
    public void setBmdm(String bmdm) 
    {
        this.bmdm = bmdm;
    }

    public String getBmdm() 
    {
        return bmdm;
    }
    public void setBmmc(String bmmc) 
    {
        this.bmmc = bmmc;
    }

    public String getBmmc() 
    {
        return bmmc;
    }
    public void setKshdm(String kshdm) 
    {
        this.kshdm = kshdm;
    }

    public String getKshdm() 
    {
        return kshdm;
    }
    public void setKshmc(String kshmc) 
    {
        this.kshmc = kshmc;
    }

    public String getKshmc() 
    {
        return kshmc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("xh", getXh())
            .append("bmz", getBmz())
            .append("bmdm", getBmdm())
            .append("bmmc", getBmmc())
            .append("kshdm", getKshdm())
            .append("kshmc", getKshmc())
            .toString();
    }
}
