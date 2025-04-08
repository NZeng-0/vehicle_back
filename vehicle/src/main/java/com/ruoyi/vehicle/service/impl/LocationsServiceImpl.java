package com.ruoyi.vehicle.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.vehicle.mapper.LocationsMapper;
import com.ruoyi.vehicle.domain.Locations;
import com.ruoyi.vehicle.service.ILocationsService;

/**
 * 定位Service业务层处理
 * 
 * @author me
 * @date 2025-04-08
 */
@Service
public class LocationsServiceImpl implements ILocationsService 
{
    @Autowired
    private LocationsMapper locationsMapper;

    /**
     * 查询定位
     * 
     * @param id 定位主键
     * @return 定位
     */
    @Override
    public Locations selectLocationsById(Long id)
    {
        return locationsMapper.selectLocationsById(id);
    }

    @Override
    public List<Locations> selectLocationsByCarId(Long carId)
    {
        return locationsMapper.selectLocationsByCarId(carId);
    }

    /**
     * 查询定位列表
     * 
     * @param locations 定位
     * @return 定位
     */
    @Override
    public List<Locations> selectLocationsList(Locations locations)
    {
        return locationsMapper.selectLocationsList(locations);
    }

    /**
     * 新增定位
     * 
     * @param locations 定位
     * @return 结果
     */
    @Override
    public int insertLocations(Locations locations)
    {
        return locationsMapper.insertLocations(locations);
    }

    /**
     * 修改定位
     * 
     * @param locations 定位
     * @return 结果
     */
    @Override
    public int updateLocations(Locations locations)
    {
        return locationsMapper.updateLocations(locations);
    }

    /**
     * 批量删除定位
     * 
     * @param ids 需要删除的定位主键
     * @return 结果
     */
    @Override
    public int deleteLocationsByIds(Long[] ids)
    {
        return locationsMapper.deleteLocationsByIds(ids);
    }

    /**
     * 删除定位信息
     * 
     * @param id 定位主键
     * @return 结果
     */
    @Override
    public int deleteLocationsById(Long id)
    {
        return locationsMapper.deleteLocationsById(id);
    }
}
