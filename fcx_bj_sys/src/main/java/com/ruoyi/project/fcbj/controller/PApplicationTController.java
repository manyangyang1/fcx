package com.ruoyi.project.fcbj.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.fcbj.domain.PApplicationT;
import com.ruoyi.project.fcbj.service.IPApplicationTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 申请单Controller
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@RestController
@RequestMapping("/fcbj/t")
public class PApplicationTController extends BaseController
{
    @Autowired
    private IPApplicationTService pApplicationTService;

    /**
     * 查询申请单列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:t:list')")
    @GetMapping("/list")
    public TableDataInfo list(PApplicationT pApplicationT)
    {
        startPage();
        List<PApplicationT> list = pApplicationTService.selectPApplicationTList(pApplicationT);
        return getDataTable(list);
    }

    /**
     * 导出申请单列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:t:export')")
    @Log(title = "申请单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PApplicationT pApplicationT)
    {
        List<PApplicationT> list = pApplicationTService.selectPApplicationTList(pApplicationT);
        ExcelUtil<PApplicationT> util = new ExcelUtil<PApplicationT>(PApplicationT.class);
        util.exportExcel(response, list, "申请单数据");
    }

    /**
     * 获取申请单详细信息
     */
    @PreAuthorize("@ss.hasPermi('fcbj:t:query')")
    @GetMapping(value = "/{rowId}")
    public AjaxResult getInfo(@PathVariable("rowId") String rowId)
    {
        return success(pApplicationTService.selectPApplicationTByRowId(rowId));
    }

    /**
     * 新增申请单
     */
    @PreAuthorize("@ss.hasPermi('fcbj:t:add')")
    @Log(title = "申请单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PApplicationT pApplicationT)
    {
        return toAjax(pApplicationTService.insertPApplicationT(pApplicationT));
    }

    /**
     * 修改申请单
     */
    @PreAuthorize("@ss.hasPermi('fcbj:t:edit')")
    @Log(title = "申请单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PApplicationT pApplicationT)
    {
        return toAjax(pApplicationTService.updatePApplicationT(pApplicationT));
    }

    /**
     * 删除申请单
     */
    @PreAuthorize("@ss.hasPermi('fcbj:t:remove')")
    @Log(title = "申请单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{rowIds}")
    public AjaxResult remove(@PathVariable String[] rowIds)
    {
        return toAjax(pApplicationTService.deletePApplicationTByRowIds(rowIds));
    }
}
