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
import com.ruoyi.project.fcbj.domain.DCredential;
import com.ruoyi.project.fcbj.service.IDCredentialService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 证件类型Controller
 * 
 * @author gxcx
 * @date 2023-06-09
 */
@RestController
@RequestMapping("/fcbj/credential")
public class DCredentialController extends BaseController
{
    @Autowired
    private IDCredentialService dCredentialService;

    /**
     * 查询证件类型列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:credential:list')")
    @GetMapping("/list")
    public TableDataInfo list(DCredential dCredential)
    {
        startPage();
        List<DCredential> list = dCredentialService.selectDCredentialList(dCredential);
        return getDataTable(list);
    }

    /**
     * 导出证件类型列表
     */
    @PreAuthorize("@ss.hasPermi('fcbj:credential:export')")
    @Log(title = "证件类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DCredential dCredential)
    {
        List<DCredential> list = dCredentialService.selectDCredentialList(dCredential);
        ExcelUtil<DCredential> util = new ExcelUtil<DCredential>(DCredential.class);
        util.exportExcel(response, list, "证件类型数据");
    }

    /**
     * 获取证件类型详细信息
     */
    @PreAuthorize("@ss.hasPermi('fcbj:credential:query')")
    @GetMapping(value = "/{credentialCode}")
    public AjaxResult getInfo(@PathVariable("credentialCode") String credentialCode)
    {
        return success(dCredentialService.selectDCredentialByCredentialCode(credentialCode));
    }

    /**
     * 新增证件类型
     */
    @PreAuthorize("@ss.hasPermi('fcbj:credential:add')")
    @Log(title = "证件类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DCredential dCredential)
    {
        return toAjax(dCredentialService.insertDCredential(dCredential));
    }

    /**
     * 修改证件类型
     */
    @PreAuthorize("@ss.hasPermi('fcbj:credential:edit')")
    @Log(title = "证件类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DCredential dCredential)
    {
        return toAjax(dCredentialService.updateDCredential(dCredential));
    }

    /**
     * 删除证件类型
     */
    @PreAuthorize("@ss.hasPermi('fcbj:credential:remove')")
    @Log(title = "证件类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{credentialCodes}")
    public AjaxResult remove(@PathVariable String[] credentialCodes)
    {
        return toAjax(dCredentialService.deleteDCredentialByCredentialCodes(credentialCodes));
    }
}
