package com.ruoyi.vehicle.service.impl;

import java.util.List;

import com.ruoyi.vehicle.domain.CarReturnInfo;
import com.ruoyi.vehicle.domain.DispatchRecords;
import com.ruoyi.vehicle.domain.Vehicles;
import com.ruoyi.vehicle.mapper.CostStatisticsMapper;
import com.ruoyi.vehicle.mapper.DispatchRecordsMapper;
import com.ruoyi.vehicle.mapper.VehiclesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.vehicle.mapper.VehicleApplicationsMapper;
import com.ruoyi.vehicle.domain.VehicleApplications;
import com.ruoyi.vehicle.service.IVehicleApplicationsService;

/**
 * 车辆申请Service业务层处理
 * 
 * @author me
 * @date 2025-04-05
 */
@Service
public class VehicleApplicationsServiceImpl implements IVehicleApplicationsService 
{
    @Autowired
    private VehicleApplicationsMapper vehicleApplicationsMapper;

    @Autowired
    private VehiclesMapper vehiclesMapper;

    @Autowired
    private CostStatisticsMapper costStatisticsMapper;


    /**
     * 查询车辆申请
     * 
     * @param id 车辆申请主键
     * @return 车辆申请
     */
    @Override
    public VehicleApplications selectVehicleApplicationsById(Long id)
    {
        return vehicleApplicationsMapper.selectVehicleApplicationsById(id);
    }

    /**
     * 查询车辆申请列表
     * 
     * @param vehicleApplications 车辆申请
     * @return 车辆申请
     */
    @Override
    public List<VehicleApplications> selectVehicleApplicationsList(VehicleApplications vehicleApplications)
    {
        return vehicleApplicationsMapper.selectVehicleApplicationsList(vehicleApplications);
    }

    /**
     * 新增车辆申请
     * 
     * @param vehicleApplications 车辆申请
     * @return 结果
     */
    @Override
    public int insertVehicleApplications(VehicleApplications vehicleApplications)
    {
        return vehicleApplicationsMapper.insertVehicleApplications(vehicleApplications);
    }

    /**
     * 修改车辆申请
     * 
     * @param vehicleApplications 车辆申请
     * @return 结果
     */
    @Override
    public int updateVehicleApplications(VehicleApplications vehicleApplications)
    {
        return vehicleApplicationsMapper.updateVehicleApplications(vehicleApplications);
    }

    /**
     * 批量删除车辆申请
     * 
     * @param ids 需要删除的车辆申请主键
     * @return 结果
     */
    @Override
    public int deleteVehicleApplicationsByIds(Long[] ids)
    {
        return vehicleApplicationsMapper.deleteVehicleApplicationsByIds(ids);
    }

    /**
     * 删除车辆申请信息
     * 
     * @param id 车辆申请主键
     * @return 结果
     */
    @Override
    public int deleteVehicleApplicationsById(Long id)
    {
        return vehicleApplicationsMapper.deleteVehicleApplicationsById(id);
    }

    @Override
    public List<VehicleApplications> selectVehicleUseListByCarId(Long id){
        List<VehicleApplications> vehicleAppDtos = vehicleApplicationsMapper.selectVehicleUseListByCarId(id);
        return vehicleAppDtos;
    }

    @Override
    public List<VehicleApplications> selectVehicleUseListByState(){
        List<VehicleApplications> vehicleAppDtos = vehicleApplicationsMapper.selectVehicleUseListByState("approved");
        return vehicleAppDtos;
    }

    @Override
    public int complete(CarReturnInfo info) {
        int rows = vehiclesMapper.updateMileage(info.getMileage(), info.getId());
        vehicleApplicationsMapper.updateState("completed", info.getUseId());
        return 1;
    }
}
