package com.ruoyi.project.fcbj.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.fcbj.domain.DCoinsurer;
import com.ruoyi.project.fcbj.service.IDCoinsurerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 共保方式Controller
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@RestController
@RequestMapping("/fcbj/coinsurer")
public class DCoinsurerController extends BaseController
{
    @Autowired
    private IDCoinsurerService dCoinsurerService;

    /**
     * 查询共保方式列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:coinsurer:list')")
    @GetMapping("/list")
    public TableDataInfo list(DCoinsurer dCoinsurer)
    {
        startPage();
        List<DCoinsurer> list = dCoinsurerService.selectDCoinsurerList(dCoinsurer);
        return getDataTable(list);
    }

    /**
     * 导出共保方式列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:coinsurer:export')")
    @Log(title = "共保方式", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DCoinsurer dCoinsurer)
    {
        List<DCoinsurer> list = dCoinsurerService.selectDCoinsurerList(dCoinsurer);
        ExcelUtil<DCoinsurer> util = new ExcelUtil<DCoinsurer>(DCoinsurer.class);
        util.exportExcel(response, list, "共保方式数据");
    }

    /**
     * 获取共保方式详细信息
     */
    @PreAuthorize("@ss.hasPermi('fcbj:coinsurer:query')")
    @GetMapping(value = "/{coinsurerCode}")
    public AjaxResult getInfo(@PathVariable("coinsurerCode") String coinsurerCode)
    {
        return success(dCoinsurerService.selectDCoinsurerByCoinsurerCode(coinsurerCode));
    }

    /**
     * 新增共保方式
     */
    @PreAuthorize("@ss.hasPermi('fcbj:coinsurer:add')")
    @Log(title = "共保方式", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DCoinsurer dCoinsurer)
    {
        return toAjax(dCoinsurerService.insertDCoinsurer(dCoinsurer));
    }

    /**
     * 修改共保方式
     */
    @PreAuthorize("@ss.hasPermi('fcbj:coinsurer:edit')")
    @Log(title = "共保方式", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DCoinsurer dCoinsurer)
    {
        return toAjax(dCoinsurerService.updateDCoinsurer(dCoinsurer));
    }

    /**
     * 删除共保方式
     */
    @PreAuthorize("@ss.hasPermi('fcbj:coinsurer:remove')")
    @Log(title = "共保方式", businessType = BusinessType.DELETE)
	@DeleteMapping("/{coinsurerCodes}")
    public AjaxResult remove(@PathVariable String[] coinsurerCodes)
    {
        return toAjax(dCoinsurerService.deleteDCoinsurerByCoinsurerCodes(coinsurerCodes));
    }
}
