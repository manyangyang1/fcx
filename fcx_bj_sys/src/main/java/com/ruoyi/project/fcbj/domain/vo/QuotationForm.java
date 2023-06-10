package com.ruoyi.project.fcbj.domain.vo;


import com.ruoyi.project.fcbj.domain.*;
import lombok.Data;

import java.util.List;

@Data
public class QuotationForm {

    private PApplicationT application;

    private PEnterprisePropertyT enterprise;

    private PEnterprisePropertyDetail enterpriseDetail;

    private List<PEnterprisePropertyAmount> amountDetailList;

    private List<PEnterprisePropertyAddress> addressDetailList;

    /**
     * 保险类别，1-8分别为 企财-公众-工程-建意-团意-雇主-船舶-货运
     */
    private String insuranceType;

    /**
     * 保存类型，0暂存，1提交
     */
    private Integer saveType;


}
