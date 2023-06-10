package com.ruoyi.project.fcbj.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.fcbj.domain.DExpected;
import com.ruoyi.project.fcbj.service.IDExpectedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 预期费用投放Controller
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@RestController
@RequestMapping("/fcbj/expected")
public class DExpectedController extends BaseController
{
    @Autowired
    private IDExpectedService dExpectedService;

    /**
     * 查询预期费用投放列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:expected:list')")
    @GetMapping("/list")
    public TableDataInfo list(DExpected dExpected)
    {
        startPage();
        List<DExpected> list = dExpectedService.selectDExpectedList(dExpected);
        return getDataTable(list);
    }

    /**
     * 导出预期费用投放列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:expected:export')")
    @Log(title = "预期费用投放", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DExpected dExpected)
    {
        List<DExpected> list = dExpectedService.selectDExpectedList(dExpected);
        ExcelUtil<DExpected> util = new ExcelUtil<DExpected>(DExpected.class);
        util.exportExcel(response, list, "预期费用投放数据");
    }

    /**
     * 获取预期费用投放详细信息
     */
    @PreAuthorize("@ss.hasPermi('fcbj:expected:query')")
    @GetMapping(value = "/{expectedCode}")
    public AjaxResult getInfo(@PathVariable("expectedCode") String expectedCode)
    {
        return success(dExpectedService.selectDExpectedByExpectedCode(expectedCode));
    }

    /**
     * 新增预期费用投放
     */
    @PreAuthorize("@ss.hasPermi('fcbj:expected:add')")
    @Log(title = "预期费用投放", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DExpected dExpected)
    {
        return toAjax(dExpectedService.insertDExpected(dExpected));
    }

    /**
     * 修改预期费用投放
     */
    @PreAuthorize("@ss.hasPermi('fcbj:expected:edit')")
    @Log(title = "预期费用投放", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DExpected dExpected)
    {
        return toAjax(dExpectedService.updateDExpected(dExpected));
    }

    /**
     * 删除预期费用投放
     */
    @PreAuthorize("@ss.hasPermi('fcbj:expected:remove')")
    @Log(title = "预期费用投放", businessType = BusinessType.DELETE)
	@DeleteMapping("/{expectedCodes}")
    public AjaxResult remove(@PathVariable String[] expectedCodes)
    {
        return toAjax(dExpectedService.deleteDExpectedByExpectedCodes(expectedCodes));
    }
}
