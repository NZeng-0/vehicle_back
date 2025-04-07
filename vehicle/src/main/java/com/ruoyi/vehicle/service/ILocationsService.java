package com.ruoyi.vehicle.service;

import java.util.List;
import com.ruoyi.vehicle.domain.Locations;

/**
 * 实时定位Service接口
 * 
 * @author me
 * @date 2025-04-05
 */
public interface ILocationsService 
{
    /**
     * 查询实时定位
     * 
     * @param id 实时定位主键
     * @return 实时定位
     */
    public Locations selectLocationsById(Long id);

    /**
     * 查询实时定位列表
     * 
     * @param locations 实时定位
     * @return 实时定位集合
     */
    public List<Locations> selectLocationsList(Locations locations);

    /**
     * 新增实时定位
     * 
     * @param locations 实时定位
     * @return 结果
     */
    public int insertLocations(Locations locations);

    /**
     * 修改实时定位
     * 
     * @param locations 实时定位
     * @return 结果
     */
    public int updateLocations(Locations locations);

    /**
     * 批量删除实时定位
     * 
     * @param ids 需要删除的实时定位主键集合
     * @return 结果
     */
    public int deleteLocationsByIds(Long[] ids);

    /**
     * 删除实时定位信息
     * 
     * @param id 实时定位主键
     * @return 结果
     */
    public int deleteLocationsById(Long id);
}
