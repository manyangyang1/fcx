package com.ruoyi.project.fcbj.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.fcbj.domain.PEnterprisePropertyDetail;
import com.ruoyi.project.fcbj.service.IPEnterprisePropertyDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 企财险报价明细Controller
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@RestController
@RequestMapping("/fcbj/detail")
public class PEnterprisePropertyDetailController extends BaseController
{
    @Autowired
    private IPEnterprisePropertyDetailService pEnterprisePropertyDetailService;

    /**
     * 查询企财险报价明细列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:detail:list')")
    @GetMapping("/list")
    public TableDataInfo list(PEnterprisePropertyDetail pEnterprisePropertyDetail)
    {
        startPage();
        List<PEnterprisePropertyDetail> list = pEnterprisePropertyDetailService.selectPEnterprisePropertyDetailList(pEnterprisePropertyDetail);
        return getDataTable(list);
    }

    /**
     * 导出企财险报价明细列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:detail:export')")
    @Log(title = "企财险报价明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PEnterprisePropertyDetail pEnterprisePropertyDetail)
    {
        List<PEnterprisePropertyDetail> list = pEnterprisePropertyDetailService.selectPEnterprisePropertyDetailList(pEnterprisePropertyDetail);
        ExcelUtil<PEnterprisePropertyDetail> util = new ExcelUtil<PEnterprisePropertyDetail>(PEnterprisePropertyDetail.class);
        util.exportExcel(response, list, "企财险报价明细数据");
    }

    /**
     * 获取企财险报价明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('fcbj:detail:query')")
    @GetMapping(value = "/{rowId}")
    public AjaxResult getInfo(@PathVariable("rowId") String rowId)
    {
        return success(pEnterprisePropertyDetailService.selectPEnterprisePropertyDetailByRowId(rowId));
    }

    /**
     * 新增企财险报价明细
     */
    @PreAuthorize("@ss.hasPermi('fcbj:detail:add')")
    @Log(title = "企财险报价明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PEnterprisePropertyDetail pEnterprisePropertyDetail)
    {
        return toAjax(pEnterprisePropertyDetailService.insertPEnterprisePropertyDetail(pEnterprisePropertyDetail));
    }

    /**
     * 修改企财险报价明细
     */
    @PreAuthorize("@ss.hasPermi('fcbj:detail:edit')")
    @Log(title = "企财险报价明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PEnterprisePropertyDetail pEnterprisePropertyDetail)
    {
        return toAjax(pEnterprisePropertyDetailService.updatePEnterprisePropertyDetail(pEnterprisePropertyDetail));
    }

    /**
     * 删除企财险报价明细
     */
    @PreAuthorize("@ss.hasPermi('fcbj:detail:remove')")
    @Log(title = "企财险报价明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{rowIds}")
    public AjaxResult remove(@PathVariable String[] rowIds)
    {
        return toAjax(pEnterprisePropertyDetailService.deletePEnterprisePropertyDetailByRowIds(rowIds));
    }
}
