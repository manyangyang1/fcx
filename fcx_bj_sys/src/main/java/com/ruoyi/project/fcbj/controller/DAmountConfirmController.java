package com.ruoyi.project.fcbj.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.fcbj.domain.DAmountConfirm;
import com.ruoyi.project.fcbj.service.IDAmountConfirmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 保险金额确定方式Controller
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@RestController
@RequestMapping("/fcbj/confirm1")
public class DAmountConfirmController extends BaseController
{
    @Autowired
    private IDAmountConfirmService dAmountConfirmService;

    /**
     * 查询保险金额确定方式列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:confirm:list')")
    @GetMapping("/list")
    public TableDataInfo list(DAmountConfirm dAmountConfirm)
    {
        startPage();
        List<DAmountConfirm> list = dAmountConfirmService.selectDAmountConfirmList(dAmountConfirm);
        return getDataTable(list);
    }

    /**
     * 导出保险金额确定方式列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:confirm:export')")
    @Log(title = "保险金额确定方式", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DAmountConfirm dAmountConfirm)
    {
        List<DAmountConfirm> list = dAmountConfirmService.selectDAmountConfirmList(dAmountConfirm);
        ExcelUtil<DAmountConfirm> util = new ExcelUtil<DAmountConfirm>(DAmountConfirm.class);
        util.exportExcel(response, list, "保险金额确定方式数据");
    }

    /**
     * 获取保险金额确定方式详细信息
     */
    @PreAuthorize("@ss.hasPermi('fcbj:confirm:query')")
    @GetMapping(value = "/{propertyType}")
    public AjaxResult getInfo(@PathVariable("propertyType") String propertyType)
    {
        return success(dAmountConfirmService.selectDAmountConfirmByPropertyType(propertyType));
    }

    /**
     * 新增保险金额确定方式
     */
    @PreAuthorize("@ss.hasPermi('fcbj:confirm:add')")
    @Log(title = "保险金额确定方式", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DAmountConfirm dAmountConfirm)
    {
        return toAjax(dAmountConfirmService.insertDAmountConfirm(dAmountConfirm));
    }

    /**
     * 修改保险金额确定方式
     */
    @PreAuthorize("@ss.hasPermi('fcbj:confirm:edit')")
    @Log(title = "保险金额确定方式", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DAmountConfirm dAmountConfirm)
    {
        return toAjax(dAmountConfirmService.updateDAmountConfirm(dAmountConfirm));
    }

    /**
     * 删除保险金额确定方式
     */
    @PreAuthorize("@ss.hasPermi('fcbj:confirm:remove')")
    @Log(title = "保险金额确定方式", businessType = BusinessType.DELETE)
	@DeleteMapping("/{propertyTypes}")
    public AjaxResult remove(@PathVariable String[] propertyTypes)
    {
        return toAjax(dAmountConfirmService.deleteDAmountConfirmByPropertyTypes(propertyTypes));
    }
}
