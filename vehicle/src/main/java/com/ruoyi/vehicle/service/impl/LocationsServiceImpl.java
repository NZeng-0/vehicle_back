package com.ruoyi.vehicle.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.vehicle.mapper.LocationsMapper;
import com.ruoyi.vehicle.domain.Locations;
import com.ruoyi.vehicle.service.ILocationsService;

/**
 * 实时定位Service业务层处理
 * 
 * @author me
 * @date 2025-04-05
 */
@Service
public class LocationsServiceImpl implements ILocationsService 
{
    @Autowired
    private LocationsMapper locationsMapper;

    /**
     * 查询实时定位
     * 
     * @param id 实时定位主键
     * @return 实时定位
     */
    @Override
    public Locations selectLocationsById(Long id)
    {
        return locationsMapper.selectLocationsById(id);
    }

    /**
     * 查询实时定位列表
     * 
     * @param locations 实时定位
     * @return 实时定位
     */
    @Override
    public List<Locations> selectLocationsList(Locations locations)
    {
        return locationsMapper.selectLocationsList(locations);
    }

    /**
     * 新增实时定位
     * 
     * @param locations 实时定位
     * @return 结果
     */
    @Override
    public int insertLocations(Locations locations)
    {
        return locationsMapper.insertLocations(locations);
    }

    /**
     * 修改实时定位
     * 
     * @param locations 实时定位
     * @return 结果
     */
    @Override
    public int updateLocations(Locations locations)
    {
        return locationsMapper.updateLocations(locations);
    }

    /**
     * 批量删除实时定位
     * 
     * @param ids 需要删除的实时定位主键
     * @return 结果
     */
    @Override
    public int deleteLocationsByIds(Long[] ids)
    {
        return locationsMapper.deleteLocationsByIds(ids);
    }

    /**
     * 删除实时定位信息
     * 
     * @param id 实时定位主键
     * @return 结果
     */
    @Override
    public int deleteLocationsById(Long id)
    {
        return locationsMapper.deleteLocationsById(id);
    }
}
