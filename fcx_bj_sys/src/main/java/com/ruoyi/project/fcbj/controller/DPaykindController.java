package com.ruoyi.project.fcbj.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.fcbj.domain.DPaykind;
import com.ruoyi.project.fcbj.service.IDPaykindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 支付方式Controller
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@RestController
@RequestMapping("/fcbj/paykind")
public class DPaykindController extends BaseController
{
    @Autowired
    private IDPaykindService dPaykindService;

    /**
     * 查询支付方式列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:paykind:list')")
    @GetMapping("/list")
    public TableDataInfo list(DPaykind dPaykind)
    {
        startPage();
        List<DPaykind> list = dPaykindService.selectDPaykindList(dPaykind);
        return getDataTable(list);
    }

    /**
     * 导出支付方式列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:paykind:export')")
    @Log(title = "支付方式", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DPaykind dPaykind)
    {
        List<DPaykind> list = dPaykindService.selectDPaykindList(dPaykind);
        ExcelUtil<DPaykind> util = new ExcelUtil<DPaykind>(DPaykind.class);
        util.exportExcel(response, list, "支付方式数据");
    }

    /**
     * 获取支付方式详细信息
     */
    @PreAuthorize("@ss.hasPermi('fcbj:paykind:query')")
    @GetMapping(value = "/{paycode}")
    public AjaxResult getInfo(@PathVariable("paycode") String paycode)
    {
        return success(dPaykindService.selectDPaykindByPaycode(paycode));
    }

    /**
     * 新增支付方式
     */
    @PreAuthorize("@ss.hasPermi('fcbj:paykind:add')")
    @Log(title = "支付方式", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DPaykind dPaykind)
    {
        return toAjax(dPaykindService.insertDPaykind(dPaykind));
    }

    /**
     * 修改支付方式
     */
    @PreAuthorize("@ss.hasPermi('fcbj:paykind:edit')")
    @Log(title = "支付方式", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DPaykind dPaykind)
    {
        return toAjax(dPaykindService.updateDPaykind(dPaykind));
    }

    /**
     * 删除支付方式
     */
    @PreAuthorize("@ss.hasPermi('fcbj:paykind:remove')")
    @Log(title = "支付方式", businessType = BusinessType.DELETE)
	@DeleteMapping("/{paycodes}")
    public AjaxResult remove(@PathVariable String[] paycodes)
    {
        return toAjax(dPaykindService.deleteDPaykindByPaycodes(paycodes));
    }
}
