package com.ruoyi.vehicle.controller;

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
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.vehicle.domain.DispatchRecords;
import com.ruoyi.vehicle.service.IDispatchRecordsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 派车记录Controller
 * 
 * @author me
 * @date 2025-04-05
 */
@RestController
@RequestMapping("/vehicle/records")
public class DispatchRecordsController extends BaseController
{
    @Autowired
    private IDispatchRecordsService dispatchRecordsService;

    /**
     * 查询派车记录列表
     */
    @GetMapping("/list")
    public TableDataInfo list(DispatchRecords dispatchRecords)
    {
        startPage();
        List<DispatchRecords> list = dispatchRecordsService.selectDispatchRecordsList(dispatchRecords);
        return getDataTable(list);
    }


    /**
     * 获取派车记录详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(dispatchRecordsService.selectDispatchRecordsById(id));
    }

    /**
     * 新增派车记录
     */
    @PostMapping
    public AjaxResult add(@RequestBody DispatchRecords dispatchRecords)
    {
        return toAjax(dispatchRecordsService.insertDispatchRecords(dispatchRecords));
    }

    /**
     * 修改派车记录
     */
    @PutMapping
    public AjaxResult edit(@RequestBody DispatchRecords dispatchRecords)
    {
        return toAjax(dispatchRecordsService.updateDispatchRecords(dispatchRecords));
    }

    /**
     * 删除派车记录
     */
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dispatchRecordsService.deleteDispatchRecordsByIds(ids));
    }
}
