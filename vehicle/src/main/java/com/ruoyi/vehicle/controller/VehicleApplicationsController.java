package com.ruoyi.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.vehicle.domain.VehicleApplications;
import com.ruoyi.vehicle.service.IVehicleApplicationsService;
import com.ruoyi.common.core.page.TableDataInfo;

@RestController
@RequestMapping("/vehicle/applications")
public class VehicleApplicationsController extends BaseController
{
    @Autowired
    private IVehicleApplicationsService vehicleApplicationsService;

    /**
     * 查询车辆申请列表
     */
    @GetMapping("/list")
    public TableDataInfo list(VehicleApplications vehicleApplications)
    {
        startPage();
        List<VehicleApplications> list = vehicleApplicationsService.selectVehicleApplicationsList(vehicleApplications);
        return getDataTable(list);
    }

    @GetMapping("/approved")
    public TableDataInfo getWaitUse()
    {
        startPage();
        List<VehicleApplications> list = vehicleApplicationsService.selectVehicleUseListByState();
        return getDataTable(list);
    }


    /**
     * 获取详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(vehicleApplicationsService.selectVehicleApplicationsById(id));
    }

    /**
     * 新增
     */
    @PostMapping
    public AjaxResult add(@RequestBody VehicleApplications vehicleApplications)
    {
        return toAjax(vehicleApplicationsService.insertVehicleApplications(vehicleApplications));
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public AjaxResult edit(@RequestBody VehicleApplications vehicleApplications)
    {
        return toAjax(vehicleApplicationsService.updateVehicleApplications(vehicleApplications));
    }

    /**
     * 删除
     */
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(vehicleApplicationsService.deleteVehicleApplicationsByIds(ids));
    }

    /**
     * 根据车辆id获取使用列表
     */
    @GetMapping(value = "/list/{id}")
    public TableDataInfo getListByCarId(@PathVariable("id") Long id)
    {
        startPage();
        List<VehicleApplications> list = vehicleApplicationsService.selectVehicleUseListByCarId(id);
        return getDataTable(list);
    }
}
