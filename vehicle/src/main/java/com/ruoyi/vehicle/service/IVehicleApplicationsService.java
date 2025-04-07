package com.ruoyi.vehicle.service;

import java.util.List;
import com.ruoyi.vehicle.domain.VehicleApplications;

/**
 * 车辆申请Service接口
 * 
 * @author me
 * @date 2025-04-05
 */
public interface IVehicleApplicationsService 
{
    /**
     * 查询车辆申请
     * 
     * @param id 车辆申请主键
     * @return 车辆申请
     */
    public VehicleApplications selectVehicleApplicationsById(Long id);

    /**
     * 查询车辆使用列表
     * 
     * @param vehicleApplications 车辆申请
     * @return 车辆申请集合
     */
    public List<VehicleApplications> selectVehicleApplicationsList(VehicleApplications vehicleApplications);

    /**
     * 新增车辆申请
     * 
     * @param vehicleApplications 车辆申请
     * @return 结果
     */
    public int insertVehicleApplications(VehicleApplications vehicleApplications);

    /**
     * 修改车辆申请
     * 
     * @param vehicleApplications 车辆申请
     * @return 结果
     */
    public int updateVehicleApplications(VehicleApplications vehicleApplications);

    /**
     * 批量删除车辆申请
     * 
     * @param ids 需要删除的车辆申请主键集合
     * @return 结果
     */
    public int deleteVehicleApplicationsByIds(Long[] ids);

    /**
     * 删除车辆申请信息
     * 
     * @param id 车辆申请主键
     * @return 结果
     */
    public int deleteVehicleApplicationsById(Long id);

    public List<VehicleApplications> selectVehicleUseListByCarId(Long id);

    public List<VehicleApplications> selectVehicleUseListByState();
}
