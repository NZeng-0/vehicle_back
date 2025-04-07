package com.ruoyi.vehicle.mapper;

import java.util.List;
import com.ruoyi.vehicle.domain.Locations;

/**
 * 实时定位Mapper接口
 * 
 * @author me
 * @date 2025-04-05
 */
public interface LocationsMapper 
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
     * 删除实时定位
     * 
     * @param id 实时定位主键
     * @return 结果
     */
    public int deleteLocationsById(Long id);

    /**
     * 批量删除实时定位
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLocationsByIds(Long[] ids);
}
