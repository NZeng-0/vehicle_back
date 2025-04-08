package com.ruoyi.vehicle.mapper;

import java.util.List;
import com.ruoyi.vehicle.domain.VehicleApplications;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * 车辆申请Mapper接口
 * 
 * @author me
 * @date 2025-04-05
 */
@Mapper
public interface VehicleApplicationsMapper 
{
    /**
     * 查询车辆申请
     * 
     * @param id 车辆申请主键
     * @return 车辆申请
     */
    public VehicleApplications selectVehicleApplicationsById(Long id);

    /**
     * 查询车辆申请列表
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
     * 删除车辆申请
     * 
     * @param id 车辆申请主键
     * @return 结果
     */
    public int deleteVehicleApplicationsById(Long id);

    /**
     * 批量删除车辆申请
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVehicleApplicationsByIds(Long[] ids);

    public List<VehicleApplications> selectVehicleUseListByCarId(Long carId);
    public List<VehicleApplications> selectVehicleUseListByState(String state);

    @Update("update t_vehicle_applications set status = #{state} where id = #{id}")
    public int updateState(@Param("state") String state, @Param("id") Long id);
}
