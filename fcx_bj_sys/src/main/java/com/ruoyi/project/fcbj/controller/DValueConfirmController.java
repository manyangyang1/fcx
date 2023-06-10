package com.ruoyi.project.fcbj.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.fcbj.domain.DValueConfirm;
import com.ruoyi.project.fcbj.service.IDValueConfirmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 保险价值确定方式Controller
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@RestController
@RequestMapping("/fcbj/confirm")
public class DValueConfirmController extends BaseController
{
    @Autowired
    private IDValueConfirmService dValueConfirmService;

    /**
     * 查询保险价值确定方式列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:confirm:list')")
    @GetMapping("/list")
    public TableDataInfo list(DValueConfirm dValueConfirm)
    {
        startPage();
        List<DValueConfirm> list = dValueConfirmService.selectDValueConfirmList(dValueConfirm);
        return getDataTable(list);
    }

    /**
     * 导出保险价值确定方式列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:confirm:export')")
    @Log(title = "保险价值确定方式", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DValueConfirm dValueConfirm)
    {
        List<DValueConfirm> list = dValueConfirmService.selectDValueConfirmList(dValueConfirm);
        ExcelUtil<DValueConfirm> util = new ExcelUtil<DValueConfirm>(DValueConfirm.class);
        util.exportExcel(response, list, "保险价值确定方式数据");
    }

    /**
     * 获取保险价值确定方式详细信息
     */
    @PreAuthorize("@ss.hasPermi('fcbj:confirm:query')")
    @GetMapping(value = "/{propertyType}")
    public AjaxResult getInfo(@PathVariable("propertyType") String propertyType)
    {
        return success(dValueConfirmService.selectDValueConfirmByPropertyType(propertyType));
    }

    /**
     * 新增保险价值确定方式
     */
    @PreAuthorize("@ss.hasPermi('fcbj:confirm:add')")
    @Log(title = "保险价值确定方式", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DValueConfirm dValueConfirm)
    {
        return toAjax(dValueConfirmService.insertDValueConfirm(dValueConfirm));
    }

    /**
     * 修改保险价值确定方式
     */
    @PreAuthorize("@ss.hasPermi('fcbj:confirm:edit')")
    @Log(title = "保险价值确定方式", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DValueConfirm dValueConfirm)
    {
        return toAjax(dValueConfirmService.updateDValueConfirm(dValueConfirm));
    }

    /**
     * 删除保险价值确定方式
     */
    @PreAuthorize("@ss.hasPermi('fcbj:confirm:remove')")
    @Log(title = "保险价值确定方式", businessType = BusinessType.DELETE)
	@DeleteMapping("/{propertyTypes}")
    public AjaxResult remove(@PathVariable String[] propertyTypes)
    {
        return toAjax(dValueConfirmService.deleteDValueConfirmByPropertyTypes(propertyTypes));
    }
}
