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
import com.ruoyi.vehicle.domain.Locations;
import com.ruoyi.vehicle.service.ILocationsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 实时定位Controller
 * 
 * @author me
 * @date 2025-04-05
 */
@RestController
@RequestMapping("/vehicle/locations")
public class LocationsController extends BaseController
{
    @Autowired
    private ILocationsService locationsService;

    /**
     * 查询实时定位列表
     */
    @PreAuthorize("@ss.hasPermi('vehicle:locations:list')")
    @GetMapping("/list")
    public TableDataInfo list(Locations locations)
    {
        startPage();
        List<Locations> list = locationsService.selectLocationsList(locations);
        return getDataTable(list);
    }

    /**
     * 导出实时定位列表
     */
    @PreAuthorize("@ss.hasPermi('vehicle:locations:export')")
    @Log(title = "实时定位", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Locations locations)
    {
        List<Locations> list = locationsService.selectLocationsList(locations);
        ExcelUtil<Locations> util = new ExcelUtil<Locations>(Locations.class);
        util.exportExcel(response, list, "实时定位数据");
    }

    /**
     * 获取实时定位详细信息
     */
    @PreAuthorize("@ss.hasPermi('vehicle:locations:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(locationsService.selectLocationsById(id));
    }

    /**
     * 新增实时定位
     */
    @PreAuthorize("@ss.hasPermi('vehicle:locations:add')")
    @Log(title = "实时定位", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Locations locations)
    {
        return toAjax(locationsService.insertLocations(locations));
    }

    /**
     * 修改实时定位
     */
    @PreAuthorize("@ss.hasPermi('vehicle:locations:edit')")
    @Log(title = "实时定位", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Locations locations)
    {
        return toAjax(locationsService.updateLocations(locations));
    }

    /**
     * 删除实时定位
     */
    @PreAuthorize("@ss.hasPermi('vehicle:locations:remove')")
    @Log(title = "实时定位", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(locationsService.deleteLocationsByIds(ids));
    }
}
