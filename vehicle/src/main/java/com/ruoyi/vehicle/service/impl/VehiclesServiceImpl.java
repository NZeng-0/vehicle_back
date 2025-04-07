package com.ruoyi.vehicle.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.vehicle.mapper.VehiclesMapper;
import com.ruoyi.vehicle.domain.Vehicles;
import com.ruoyi.vehicle.service.IVehiclesService;

/**
 * 车辆信息Service业务层处理
 * 
 * @author me
 * @date 2025-04-05
 */
@Service
public class VehiclesServiceImpl implements IVehiclesService 
{
    @Autowired
    private VehiclesMapper vehiclesMapper;

    /**
     * 查询车辆信息
     * 
     * @param id 车辆信息主键
     * @return 车辆信息
     */
    @Override
    public Vehicles selectVehiclesById(Long id)
    {
        return vehiclesMapper.selectVehiclesById(id);
    }

    /**
     * 查询车辆信息列表
     * 
     * @param vehicles 车辆信息
     * @return 车辆信息
     */
    @Override
    public List<Vehicles> selectVehiclesList(Vehicles vehicles)
    {
        return vehiclesMapper.selectVehiclesList(vehicles);
    }

    /**
     * 新增车辆信息
     * 
     * @param vehicles 车辆信息
     * @return 结果
     */
    @Override
    public int insertVehicles(Vehicles vehicles)
    {
        return vehiclesMapper.insertVehicles(vehicles);
    }

    /**
     * 修改车辆信息
     * 
     * @param vehicles 车辆信息
     * @return 结果
     */
    @Override
    public int updateVehicles(Vehicles vehicles)
    {
        return vehiclesMapper.updateVehicles(vehicles);
    }

    /**
     * 批量删除车辆信息
     * 
     * @param ids 需要删除的车辆信息主键
     * @return 结果
     */
    @Override
    public int deleteVehiclesByIds(Long[] ids)
    {
        return vehiclesMapper.deleteVehiclesByIds(ids);
    }

    /**
     * 删除车辆信息信息
     * 
     * @param id 车辆信息主键
     * @return 结果
     */
    @Override
    public int deleteVehiclesById(Long id)
    {
        return vehiclesMapper.deleteVehiclesById(id);
    }
}
