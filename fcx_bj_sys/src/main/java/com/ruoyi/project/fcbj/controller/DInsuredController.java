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
import com.ruoyi.project.fcbj.domain.DInsured;
import com.ruoyi.project.fcbj.service.IDInsuredService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 保额勾选Controller
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@RestController
@RequestMapping("/fcbj/insured")
public class DInsuredController extends BaseController
{
    @Autowired
    private IDInsuredService dInsuredService;

    /**
     * 查询保额勾选列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:insured:list')")
    @GetMapping("/list")
    public TableDataInfo list(DInsured dInsured)
    {
        startPage();
        List<DInsured> list = dInsuredService.selectDInsuredList(dInsured);
        return getDataTable(list);
    }

    /**
     * 导出保额勾选列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:insured:export')")
    @Log(title = "保额勾选", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DInsured dInsured)
    {
        List<DInsured> list = dInsuredService.selectDInsuredList(dInsured);
        ExcelUtil<DInsured> util = new ExcelUtil<DInsured>(DInsured.class);
        util.exportExcel(response, list, "保额勾选数据");
    }

    /**
     * 获取保额勾选详细信息
     */
    @PreAuthorize("@ss.hasPermi('fcbj:insured:query')")
    @GetMapping(value = "/{insuredType}")
    public AjaxResult getInfo(@PathVariable("insuredType") String insuredType)
    {
        return success(dInsuredService.selectDInsuredByInsuredType(insuredType));
    }

    /**
     * 新增保额勾选
     */
    @PreAuthorize("@ss.hasPermi('fcbj:insured:add')")
    @Log(title = "保额勾选", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DInsured dInsured)
    {
        return toAjax(dInsuredService.insertDInsured(dInsured));
    }

    /**
     * 修改保额勾选
     */
    @PreAuthorize("@ss.hasPermi('fcbj:insured:edit')")
    @Log(title = "保额勾选", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DInsured dInsured)
    {
        return toAjax(dInsuredService.updateDInsured(dInsured));
    }

    /**
     * 删除保额勾选
     */
    @PreAuthorize("@ss.hasPermi('fcbj:insured:remove')")
    @Log(title = "保额勾选", businessType = BusinessType.DELETE)
	@DeleteMapping("/{insuredTypes}")
    public AjaxResult remove(@PathVariable String[] insuredTypes)
    {
        return toAjax(dInsuredService.deleteDInsuredByInsuredTypes(insuredTypes));
    }
}
