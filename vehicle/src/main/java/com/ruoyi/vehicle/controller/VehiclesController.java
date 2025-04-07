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
import com.ruoyi.vehicle.domain.Vehicles;
import com.ruoyi.vehicle.service.IVehiclesService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 车辆信息Controller
 * 
 * @author me
 * @date 2025-04-05
 */
@RestController
@RequestMapping("/vehicle/vehicles")
public class VehiclesController extends BaseController
{
    @Autowired
    private IVehiclesService vehiclesService;

    /**
     * 查询车辆信息列表
     */
    @GetMapping("/list")
    public TableDataInfo list(Vehicles vehicles)
    {
        startPage();
        List<Vehicles> list = vehiclesService.selectVehiclesList(vehicles);
        return getDataTable(list);
    }

    /**
     * 获取车辆信息详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(vehiclesService.selectVehiclesById(id));
    }

    /**
     * 新增车辆信息
     */
    @PostMapping
    public AjaxResult add(@RequestBody Vehicles vehicles)
    {
        return toAjax(vehiclesService.insertVehicles(vehicles));
    }

    /**
     * 修改车辆信息
     */
    @PutMapping
    public AjaxResult edit(@RequestBody Vehicles vehicles)
    {
        return toAjax(vehiclesService.updateVehicles(vehicles));
    }

    /**
     * 删除车辆信息
     */
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(vehiclesService.deleteVehiclesByIds(ids));
    }
}
