package com.ruoyi.project.fcbj.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.fcbj.domain.DCustomerdept;
import com.ruoyi.project.fcbj.service.IDCustomerdeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 客群Controller
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@RestController
@RequestMapping("/fcbj/customerdept")
public class DCustomerdeptController extends BaseController
{
    @Autowired
    private IDCustomerdeptService dCustomerdeptService;

    /**
     * 查询客群列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:customerdept:list')")
    @GetMapping("/list")
    public TableDataInfo list(DCustomerdept dCustomerdept)
    {
        startPage();
        List<DCustomerdept> list = dCustomerdeptService.selectDCustomerdeptList(dCustomerdept);
        return getDataTable(list);
    }

    /**
     * 导出客群列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:customerdept:export')")
    @Log(title = "客群", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DCustomerdept dCustomerdept)
    {
        List<DCustomerdept> list = dCustomerdeptService.selectDCustomerdeptList(dCustomerdept);
        ExcelUtil<DCustomerdept> util = new ExcelUtil<DCustomerdept>(DCustomerdept.class);
        util.exportExcel(response, list, "客群数据");
    }

    /**
     * 获取客群详细信息
     */
    @PreAuthorize("@ss.hasPermi('fcbj:customerdept:query')")
    @GetMapping(value = "/{customerdept}")
    public AjaxResult getInfo(@PathVariable("customerdept") String customerdept)
    {
        return success(dCustomerdeptService.selectDCustomerdeptByCustomerdept(customerdept));
    }

    /**
     * 新增客群
     */
    @PreAuthorize("@ss.hasPermi('fcbj:customerdept:add')")
    @Log(title = "客群", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DCustomerdept dCustomerdept)
    {
        return toAjax(dCustomerdeptService.insertDCustomerdept(dCustomerdept));
    }

    /**
     * 修改客群
     */
    @PreAuthorize("@ss.hasPermi('fcbj:customerdept:edit')")
    @Log(title = "客群", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DCustomerdept dCustomerdept)
    {
        return toAjax(dCustomerdeptService.updateDCustomerdept(dCustomerdept));
    }

    /**
     * 删除客群
     */
    @PreAuthorize("@ss.hasPermi('fcbj:customerdept:remove')")
    @Log(title = "客群", businessType = BusinessType.DELETE)
	@DeleteMapping("/{customerdepts}")
    public AjaxResult remove(@PathVariable String[] customerdepts)
    {
        return toAjax(dCustomerdeptService.deleteDCustomerdeptByCustomerdepts(customerdepts));
    }
}
