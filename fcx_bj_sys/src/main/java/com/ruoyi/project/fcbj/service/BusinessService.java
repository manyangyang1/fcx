package com.ruoyi.project.fcbj.service;

import com.ruoyi.project.fcbj.domain.vo.QuotationForm;

public interface BusinessService {

    /**
     * 参考报价模板输入报价参数，新增报价信息
     *
     * @param quotationForm 新增报价单接口参数
     * @return 返回新增结果
     */
    boolean insertQuotation(QuotationForm quotationForm);
}
