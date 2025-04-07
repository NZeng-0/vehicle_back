package com.ruoyi.vehicle.mapper;

import java.util.List;
import com.ruoyi.vehicle.domain.Photos;

/**
 * 车辆照片Mapper接口
 * 
 * @author me
 * @date 2025-04-05
 */
public interface PhotosMapper 
{
    /**
     * 查询车辆照片
     * 
     * @param id 车辆照片主键
     * @return 车辆照片
     */
    public Photos selectPhotosById(Long id);

    /**
     * 查询车辆照片列表
     * 
     * @param photos 车辆照片
     * @return 车辆照片集合
     */
    public List<Photos> selectPhotosList(Photos photos);

    /**
     * 新增车辆照片
     * 
     * @param photos 车辆照片
     * @return 结果
     */
    public int insertPhotos(Photos photos);

    /**
     * 修改车辆照片
     * 
     * @param photos 车辆照片
     * @return 结果
     */
    public int updatePhotos(Photos photos);

    /**
     * 删除车辆照片
     * 
     * @param id 车辆照片主键
     * @return 结果
     */
    public int deletePhotosById(Long id);

    /**
     * 批量删除车辆照片
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePhotosByIds(Long[] ids);
}
