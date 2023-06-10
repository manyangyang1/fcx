package com.ruoyi.project.fcbj.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.fcbj.domain.PCustomerT;
import com.ruoyi.project.fcbj.service.IPCustomerTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 客户信息Controller
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@RestController
@RequestMapping("/fcbj/customer")
public class PCustomerTController extends BaseController
{
    @Autowired
    private IPCustomerTService pCustomerTService;

    /**
     * 查询客户信息列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:t:list')")
    @GetMapping("/list")
    public TableDataInfo list(PCustomerT pCustomerT)
    {
        startPage();
        List<PCustomerT> list = pCustomerTService.selectPCustomerTList(pCustomerT);
        return getDataTable(list);
    }

    /**
     * 导出客户信息列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:t:export')")
    @Log(title = "客户信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PCustomerT pCustomerT)
    {
        List<PCustomerT> list = pCustomerTService.selectPCustomerTList(pCustomerT);
        ExcelUtil<PCustomerT> util = new ExcelUtil<PCustomerT>(PCustomerT.class);
        util.exportExcel(response, list, "客户信息数据");
    }

    /**
     * 获取客户信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('fcbj:t:query')")
    @GetMapping(value = "/{rowId}")
    public AjaxResult getInfo(@PathVariable("rowId") String rowId)
    {
        return success(pCustomerTService.selectPCustomerTByRowId(rowId));
    }

    /**
     * 新增客户信息
     */
    @PreAuthorize("@ss.hasPermi('fcbj:t:add')")
    @Log(title = "客户信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PCustomerT pCustomerT)
    {
        return toAjax(pCustomerTService.insertPCustomerT(pCustomerT));
    }

    /**
     * 修改客户信息
     */
    @PreAuthorize("@ss.hasPermi('fcbj:t:edit')")
    @Log(title = "客户信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PCustomerT pCustomerT)
    {
        return toAjax(pCustomerTService.updatePCustomerT(pCustomerT));
    }

    /**
     * 删除客户信息
     */
    @PreAuthorize("@ss.hasPermi('fcbj:t:remove')")
    @Log(title = "客户信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{rowIds}")
    public AjaxResult remove(@PathVariable String[] rowIds)
    {
        return toAjax(pCustomerTService.deletePCustomerTByRowIds(rowIds));
    }
}
