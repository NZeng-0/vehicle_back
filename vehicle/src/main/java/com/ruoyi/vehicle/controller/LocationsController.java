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
 * 定位Controller
 * 
 * @author me
 * @date 2025-04-08
 */
@RestController
@RequestMapping("/vehicle/locations")
public class LocationsController extends BaseController
{
    @Autowired
    private ILocationsService locationsService;

    /**
     * 查询定位列表
     */
    @GetMapping("/list")
    public TableDataInfo list(Locations locations)
    {
        startPage();
        List<Locations> list = locationsService.selectLocationsList(locations);
        return getDataTable(list);
    }

    /**
     * 获取定位详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(locationsService.selectLocationsById(id));
    }

    @GetMapping(value = "/ {id}")
    public AjaxResult getInfoByCarId(@PathVariable("id") Long id)
    {
        return success(locationsService.selectLocationsByCarId(id));
    }

    /**
     * 新增定位
     */
    @PostMapping
    public AjaxResult add(@RequestBody Locations locations)
    {
        return toAjax(locationsService.insertLocations(locations));
    }

    /**
     * 修改定位
     */
    @PutMapping
    public AjaxResult edit(@RequestBody Locations locations)
    {
        return toAjax(locationsService.updateLocations(locations));
    }

    /**
     * 删除定位
     */
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(locationsService.deleteLocationsByIds(ids));
    }
}
