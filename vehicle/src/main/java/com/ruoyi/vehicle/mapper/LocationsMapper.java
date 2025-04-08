package com.ruoyi.vehicle.mapper;

import java.util.List;
import com.ruoyi.vehicle.domain.Locations;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定位Mapper接口
 * 
 * @author me
 * @date 2025-04-08
 */
@Mapper
public interface LocationsMapper 
{
    /**
     * 查询定位
     * 
     * @param id 定位主键
     * @return 定位
     */
    public Locations selectLocationsById(Long id);

    /**
     * 查询定位列表
     * 
     * @param locations 定位
     * @return 定位集合
     */
    public List<Locations> selectLocationsList(Locations locations);

    /**
     * 新增定位
     * 
     * @param locations 定位
     * @return 结果
     */
    public int insertLocations(Locations locations);

    /**
     * 修改定位
     * 
     * @param locations 定位
     * @return 结果
     */
    public int updateLocations(Locations locations);

    /**
     * 删除定位
     * 
     * @param id 定位主键
     * @return 结果
     */
    public int deleteLocationsById(Long id);

    /**
     * 批量删除定位
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLocationsByIds(Long[] ids);

    public List<Locations> selectLocationsByCarId(Long carId);
}
