package com.ruoyi.project.fcbj.controller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.project.fcbj.domain.vo.QuotationForm;
import com.ruoyi.project.fcbj.service.BusinessService;
import com.ruoyi.project.fcbj.service.IPApplicationTService;
import com.ruoyi.project.fcbj.service.IPEnterprisePropertyDetailService;
import com.ruoyi.project.fcbj.service.IPEnterprisePropertyTService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 业务控制器
 *
 * @author ly
 * @date 2023-06-06
 */
@RestController
@RequestMapping("/fcbj/business")
@AllArgsConstructor
public class BusinessController extends BaseController {

    private final IPEnterprisePropertyTService enterpriseService;

    private final IPEnterprisePropertyDetailService enterpriseDetailService;

    private final IPApplicationTService applicationService;

    private final BusinessService businessService;

    /**
     * 参考报价模板输入报价参数，新增报价信息
     *
     * @param quotationForm 新增报价单接口参数
     * @return 返回新增结果
     */
    @PostMapping("/quotation")
    public AjaxResult insertQuotation(@RequestBody QuotationForm quotationForm) {
        businessService.insertQuotation(quotationForm);

        return AjaxResult.success();
    }
}
