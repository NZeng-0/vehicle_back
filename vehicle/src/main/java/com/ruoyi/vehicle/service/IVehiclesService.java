package com.ruoyi.vehicle.service;

import java.util.List;
import com.ruoyi.vehicle.domain.Vehicles;

/**
 * 车辆信息Service接口
 * 
 * @author me
 * @date 2025-04-05
 */
public interface IVehiclesService 
{
    /**
     * 查询车辆信息
     * 
     * @param id 车辆信息主键
     * @return 车辆信息
     */
    public Vehicles selectVehiclesById(Long id);

    /**
     * 查询车辆信息列表
     * 
     * @param vehicles 车辆信息
     * @return 车辆信息集合
     */
    public List<Vehicles> selectVehiclesList(Vehicles vehicles);

    /**
     * 新增车辆信息
     * 
     * @param vehicles 车辆信息
     * @return 结果
     */
    public int insertVehicles(Vehicles vehicles);

    /**
     * 修改车辆信息
     * 
     * @param vehicles 车辆信息
     * @return 结果
     */
    public int updateVehicles(Vehicles vehicles);

    /**
     * 批量删除车辆信息
     * 
     * @param ids 需要删除的车辆信息主键集合
     * @return 结果
     */
    public int deleteVehiclesByIds(Long[] ids);

    /**
     * 删除车辆信息信息
     * 
     * @param id 车辆信息主键
     * @return 结果
     */
    public int deleteVehiclesById(Long id);
}
