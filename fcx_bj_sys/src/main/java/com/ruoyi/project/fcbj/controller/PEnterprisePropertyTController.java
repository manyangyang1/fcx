package com.ruoyi.project.fcbj.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.fcbj.domain.PEnterprisePropertyT;
import com.ruoyi.project.fcbj.service.IPEnterprisePropertyTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 企财险报价主Controller
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@RestController
@RequestMapping("/fcbj/t11")
public class PEnterprisePropertyTController extends BaseController
{
    @Autowired
    private IPEnterprisePropertyTService pEnterprisePropertyTService;

    /**
     * 查询企财险报价主列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:t:list')")
    @GetMapping("/list")
    public TableDataInfo list(PEnterprisePropertyT pEnterprisePropertyT)
    {
        startPage();
        List<PEnterprisePropertyT> list = pEnterprisePropertyTService.selectPEnterprisePropertyTList(pEnterprisePropertyT);
        return getDataTable(list);
    }

    /**
     * 导出企财险报价主列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:t:export')")
    @Log(title = "企财险报价主", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PEnterprisePropertyT pEnterprisePropertyT)
    {
        List<PEnterprisePropertyT> list = pEnterprisePropertyTService.selectPEnterprisePropertyTList(pEnterprisePropertyT);
        ExcelUtil<PEnterprisePropertyT> util = new ExcelUtil<PEnterprisePropertyT>(PEnterprisePropertyT.class);
        util.exportExcel(response, list, "企财险报价主数据");
    }

    /**
     * 获取企财险报价主详细信息
     */
    @PreAuthorize("@ss.hasPermi('fcbj:t:query')")
    @GetMapping(value = "/{rowId}")
    public AjaxResult getInfo(@PathVariable("rowId") String rowId)
    {
        return success(pEnterprisePropertyTService.selectPEnterprisePropertyTByRowId(rowId));
    }

    /**
     * 新增企财险报价主
     */
    @PreAuthorize("@ss.hasPermi('fcbj:t:add')")
    @Log(title = "企财险报价主", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PEnterprisePropertyT pEnterprisePropertyT)
    {
        return toAjax(pEnterprisePropertyTService.insertPEnterprisePropertyT(pEnterprisePropertyT));
    }

    /**
     * 修改企财险报价主
     */
    @PreAuthorize("@ss.hasPermi('fcbj:t:edit')")
    @Log(title = "企财险报价主", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PEnterprisePropertyT pEnterprisePropertyT)
    {
        return toAjax(pEnterprisePropertyTService.updatePEnterprisePropertyT(pEnterprisePropertyT));
    }

    /**
     * 删除企财险报价主
     */
    @PreAuthorize("@ss.hasPermi('fcbj:t:remove')")
    @Log(title = "企财险报价主", businessType = BusinessType.DELETE)
	@DeleteMapping("/{rowIds}")
    public AjaxResult remove(@PathVariable String[] rowIds)
    {
        return toAjax(pEnterprisePropertyTService.deletePEnterprisePropertyTByRowIds(rowIds));
    }
}
