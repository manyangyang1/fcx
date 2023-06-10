package com.ruoyi.project.fcbj.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.fcbj.domain.DProduct;
import com.ruoyi.project.fcbj.service.IDProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 险类-险种Controller
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@RestController
@RequestMapping("/fcbj/product")
public class DProductController extends BaseController
{
    @Autowired
    private IDProductService dProductService;

    /**
     * 查询险类-险种列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:product:list')")
    @GetMapping("/list")
    public TableDataInfo list(DProduct dProduct)
    {
        startPage();
        List<DProduct> list = dProductService.selectDProductList(dProduct);
        return getDataTable(list);
    }

    /**
     * 导出险类-险种列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:product:export')")
    @Log(title = "险类-险种", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DProduct dProduct)
    {
        List<DProduct> list = dProductService.selectDProductList(dProduct);
        ExcelUtil<DProduct> util = new ExcelUtil<DProduct>(DProduct.class);
        util.exportExcel(response, list, "险类-险种数据");
    }

    /**
     * 获取险类-险种详细信息
     */
    @PreAuthorize("@ss.hasPermi('fcbj:product:query')")
    @GetMapping(value = "/{productType}")
    public AjaxResult getInfo(@PathVariable("productType") String productType)
    {
        return success(dProductService.selectDProductByProductType(productType));
    }

    /**
     * 新增险类-险种
     */
    @PreAuthorize("@ss.hasPermi('fcbj:product:add')")
    @Log(title = "险类-险种", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DProduct dProduct)
    {
        return toAjax(dProductService.insertDProduct(dProduct));
    }

    /**
     * 修改险类-险种
     */
    @PreAuthorize("@ss.hasPermi('fcbj:product:edit')")
    @Log(title = "险类-险种", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DProduct dProduct)
    {
        return toAjax(dProductService.updateDProduct(dProduct));
    }

    /**
     * 删除险类-险种
     */
    @PreAuthorize("@ss.hasPermi('fcbj:product:remove')")
    @Log(title = "险类-险种", businessType = BusinessType.DELETE)
	@DeleteMapping("/{productTypes}")
    public AjaxResult remove(@PathVariable String[] productTypes)
    {
        return toAjax(dProductService.deleteDProductByProductTypes(productTypes));
    }
}
