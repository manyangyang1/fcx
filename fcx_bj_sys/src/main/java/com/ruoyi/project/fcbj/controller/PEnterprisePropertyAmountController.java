package com.ruoyi.project.fcbj.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.fcbj.domain.PEnterprisePropertyAmount;
import com.ruoyi.project.fcbj.service.IPEnterprisePropertyAmountService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 企财险保额Controller
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@RestController
@RequestMapping("/fcbj/amount")
public class PEnterprisePropertyAmountController extends BaseController
{
    @Autowired
    private IPEnterprisePropertyAmountService pEnterprisePropertyAmountService;

    /**
     * 查询企财险保额列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:amount:list')")
    @GetMapping("/list")
    public TableDataInfo list(PEnterprisePropertyAmount pEnterprisePropertyAmount)
    {
        startPage();
        List<PEnterprisePropertyAmount> list = pEnterprisePropertyAmountService.selectPEnterprisePropertyAmountList(pEnterprisePropertyAmount);
        return getDataTable(list);
    }

    /**
     * 导出企财险保额列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:amount:export')")
    @Log(title = "企财险保额", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PEnterprisePropertyAmount pEnterprisePropertyAmount)
    {
        List<PEnterprisePropertyAmount> list = pEnterprisePropertyAmountService.selectPEnterprisePropertyAmountList(pEnterprisePropertyAmount);
        ExcelUtil<PEnterprisePropertyAmount> util = new ExcelUtil<PEnterprisePropertyAmount>(PEnterprisePropertyAmount.class);
        util.exportExcel(response, list, "企财险保额数据");
    }

    /**
     * 获取企财险保额详细信息
     */
    @PreAuthorize("@ss.hasPermi('fcbj:amount:query')")
    @GetMapping(value = "/{rowId}")
    public AjaxResult getInfo(@PathVariable("rowId") String rowId)
    {
        return success(pEnterprisePropertyAmountService.selectPEnterprisePropertyAmountByRowId(rowId));
    }

    /**
     * 新增企财险保额
     */
    @PreAuthorize("@ss.hasPermi('fcbj:amount:add')")
    @Log(title = "企财险保额", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PEnterprisePropertyAmount pEnterprisePropertyAmount)
    {
        return toAjax(pEnterprisePropertyAmountService.insertPEnterprisePropertyAmount(pEnterprisePropertyAmount));
    }

    /**
     * 修改企财险保额
     */
    @PreAuthorize("@ss.hasPermi('fcbj:amount:edit')")
    @Log(title = "企财险保额", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PEnterprisePropertyAmount pEnterprisePropertyAmount)
    {
        return toAjax(pEnterprisePropertyAmountService.updatePEnterprisePropertyAmount(pEnterprisePropertyAmount));
    }

    /**
     * 删除企财险保额
     */
    @PreAuthorize("@ss.hasPermi('fcbj:amount:remove')")
    @Log(title = "企财险保额", businessType = BusinessType.DELETE)
	@DeleteMapping("/{rowIds}")
    public AjaxResult remove(@PathVariable String[] rowIds)
    {
        return toAjax(pEnterprisePropertyAmountService.deletePEnterprisePropertyAmountByRowIds(rowIds));
    }
}
