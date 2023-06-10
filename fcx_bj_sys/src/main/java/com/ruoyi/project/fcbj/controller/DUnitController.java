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
import com.ruoyi.project.fcbj.domain.DUnit;
import com.ruoyi.project.fcbj.service.IDUnitService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 机构代码Controller
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@RestController
@RequestMapping("/fcbj/unit")
public class DUnitController extends BaseController
{
    @Autowired
    private IDUnitService dUnitService;

    /**
     * 查询机构代码列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:unit:list')")
    @GetMapping("/list")
    public TableDataInfo list(DUnit dUnit)
    {
        startPage();
        List<DUnit> list = dUnitService.selectDUnitList(dUnit);
        return getDataTable(list);
    }

    /**
     * 导出机构代码列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:unit:export')")
    @Log(title = "机构代码", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DUnit dUnit)
    {
        List<DUnit> list = dUnitService.selectDUnitList(dUnit);
        ExcelUtil<DUnit> util = new ExcelUtil<DUnit>(DUnit.class);
        util.exportExcel(response, list, "机构代码数据");
    }

    /**
     * 获取机构代码详细信息
     */
    @PreAuthorize("@ss.hasPermi('fcbj:unit:query')")
    @GetMapping(value = "/{xh}")
    public AjaxResult getInfo(@PathVariable("xh") Long xh)
    {
        return success(dUnitService.selectDUnitByXh(xh));
    }

    /**
     * 新增机构代码
     */
    @PreAuthorize("@ss.hasPermi('fcbj:unit:add')")
    @Log(title = "机构代码", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DUnit dUnit)
    {
        return toAjax(dUnitService.insertDUnit(dUnit));
    }

    /**
     * 修改机构代码
     */
    @PreAuthorize("@ss.hasPermi('fcbj:unit:edit')")
    @Log(title = "机构代码", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DUnit dUnit)
    {
        return toAjax(dUnitService.updateDUnit(dUnit));
    }

    /**
     * 删除机构代码
     */
    @PreAuthorize("@ss.hasPermi('fcbj:unit:remove')")
    @Log(title = "机构代码", businessType = BusinessType.DELETE)
	@DeleteMapping("/{xhs}")
    public AjaxResult remove(@PathVariable Long[] xhs)
    {
        return toAjax(dUnitService.deleteDUnitByXhs(xhs));
    }
}
