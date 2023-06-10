package com.ruoyi.project.fcbj.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.fcbj.domain.PEnterprisePropertyAddress;
import com.ruoyi.project.fcbj.service.IPEnterprisePropertyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 【请填写功能名称】Controller
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@RestController
@RequestMapping("/fcbj/address")
public class PEnterprisePropertyAddressController extends BaseController
{
    @Autowired
    private IPEnterprisePropertyAddressService pEnterprisePropertyAddressService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:address:list')")
    @GetMapping("/list")
    public TableDataInfo list(PEnterprisePropertyAddress pEnterprisePropertyAddress)
    {
        startPage();
        List<PEnterprisePropertyAddress> list = pEnterprisePropertyAddressService.selectPEnterprisePropertyAddressList(pEnterprisePropertyAddress);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:address:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PEnterprisePropertyAddress pEnterprisePropertyAddress)
    {
        List<PEnterprisePropertyAddress> list = pEnterprisePropertyAddressService.selectPEnterprisePropertyAddressList(pEnterprisePropertyAddress);
        ExcelUtil<PEnterprisePropertyAddress> util = new ExcelUtil<PEnterprisePropertyAddress>(PEnterprisePropertyAddress.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('fcbj:address:query')")
    @GetMapping(value = "/{rowId}")
    public AjaxResult getInfo(@PathVariable("rowId") String rowId)
    {
        return success(pEnterprisePropertyAddressService.selectPEnterprisePropertyAddressByRowId(rowId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('fcbj:address:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PEnterprisePropertyAddress pEnterprisePropertyAddress)
    {
        return toAjax(pEnterprisePropertyAddressService.insertPEnterprisePropertyAddress(pEnterprisePropertyAddress));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('fcbj:address:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PEnterprisePropertyAddress pEnterprisePropertyAddress)
    {
        return toAjax(pEnterprisePropertyAddressService.updatePEnterprisePropertyAddress(pEnterprisePropertyAddress));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('fcbj:address:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{rowIds}")
    public AjaxResult remove(@PathVariable String[] rowIds)
    {
        return toAjax(pEnterprisePropertyAddressService.deletePEnterprisePropertyAddressByRowIds(rowIds));
    }
}
