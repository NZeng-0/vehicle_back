package com.ruoyi.vehicle.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.vehicle.mapper.PhotosMapper;
import com.ruoyi.vehicle.domain.Photos;
import com.ruoyi.vehicle.service.IPhotosService;

/**
 * 车辆照片Service业务层处理
 * 
 * @author me
 * @date 2025-04-05
 */
@Service
public class PhotosServiceImpl implements IPhotosService 
{
    @Autowired
    private PhotosMapper photosMapper;

    /**
     * 查询车辆照片
     * 
     * @param id 车辆照片主键
     * @return 车辆照片
     */
    @Override
    public Photos selectPhotosById(Long id)
    {
        return photosMapper.selectPhotosById(id);
    }

    /**
     * 查询车辆照片列表
     * 
     * @param photos 车辆照片
     * @return 车辆照片
     */
    @Override
    public List<Photos> selectPhotosList(Photos photos)
    {
        return photosMapper.selectPhotosList(photos);
    }

    /**
     * 新增车辆照片
     * 
     * @param photos 车辆照片
     * @return 结果
     */
    @Override
    public int insertPhotos(Photos photos)
    {
        return photosMapper.insertPhotos(photos);
    }

    /**
     * 修改车辆照片
     * 
     * @param photos 车辆照片
     * @return 结果
     */
    @Override
    public int updatePhotos(Photos photos)
    {
        return photosMapper.updatePhotos(photos);
    }

    /**
     * 批量删除车辆照片
     * 
     * @param ids 需要删除的车辆照片主键
     * @return 结果
     */
    @Override
    public int deletePhotosByIds(Long[] ids)
    {
        return photosMapper.deletePhotosByIds(ids);
    }

    /**
     * 删除车辆照片信息
     * 
     * @param id 车辆照片主键
     * @return 结果
     */
    @Override
    public int deletePhotosById(Long id)
    {
        return photosMapper.deletePhotosById(id);
    }
}
