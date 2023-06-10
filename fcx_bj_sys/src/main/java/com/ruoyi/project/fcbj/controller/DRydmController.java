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
import com.ruoyi.project.fcbj.domain.DRydm;
import com.ruoyi.project.fcbj.service.IDRydmService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 人员代码Controller
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@RestController
@RequestMapping("/fcbj/rydm")
public class DRydmController extends BaseController
{
    @Autowired
    private IDRydmService dRydmService;

    /**
     * 查询人员代码列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:rydm:list')")
    @GetMapping("/list")
    public TableDataInfo list(DRydm dRydm)
    {
        startPage();
        List<DRydm> list = dRydmService.selectDRydmList(dRydm);
        return getDataTable(list);
    }

    /**
     * 导出人员代码列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:rydm:export')")
    @Log(title = "人员代码", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DRydm dRydm)
    {
        List<DRydm> list = dRydmService.selectDRydmList(dRydm);
        ExcelUtil<DRydm> util = new ExcelUtil<DRydm>(DRydm.class);
        util.exportExcel(response, list, "人员代码数据");
    }

    /**
     * 获取人员代码详细信息
     */
    @PreAuthorize("@ss.hasPermi('fcbj:rydm:query')")
    @GetMapping(value = "/{p13uid}")
    public AjaxResult getInfo(@PathVariable("p13uid") String p13uid)
    {
        return success(dRydmService.selectDRydmByP13uid(p13uid));
    }

    /**
     * 新增人员代码
     */
    @PreAuthorize("@ss.hasPermi('fcbj:rydm:add')")
    @Log(title = "人员代码", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DRydm dRydm)
    {
        return toAjax(dRydmService.insertDRydm(dRydm));
    }

    /**
     * 修改人员代码
     */
    @PreAuthorize("@ss.hasPermi('fcbj:rydm:edit')")
    @Log(title = "人员代码", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DRydm dRydm)
    {
        return toAjax(dRydmService.updateDRydm(dRydm));
    }

    /**
     * 删除人员代码
     */
    @PreAuthorize("@ss.hasPermi('fcbj:rydm:remove')")
    @Log(title = "人员代码", businessType = BusinessType.DELETE)
	@DeleteMapping("/{p13uids}")
    public AjaxResult remove(@PathVariable String[] p13uids)
    {
        return toAjax(dRydmService.deleteDRydmByP13uids(p13uids));
    }
}
