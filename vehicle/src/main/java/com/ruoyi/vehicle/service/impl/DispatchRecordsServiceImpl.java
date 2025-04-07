package com.ruoyi.vehicle.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.vehicle.mapper.DispatchRecordsMapper;
import com.ruoyi.vehicle.domain.DispatchRecords;
import com.ruoyi.vehicle.service.IDispatchRecordsService;

/**
 * 派车记录Service业务层处理
 * 
 * @author me
 * @date 2025-04-05
 */
@Service
public class DispatchRecordsServiceImpl implements IDispatchRecordsService 
{
    @Autowired
    private DispatchRecordsMapper dispatchRecordsMapper;

    /**
     * 查询派车记录
     * 
     * @param id 派车记录主键
     * @return 派车记录
     */
    @Override
    public DispatchRecords selectDispatchRecordsById(Long id)
    {
        return dispatchRecordsMapper.selectDispatchRecordsById(id);
    }

    /**
     * 查询派车记录列表
     * 
     * @param dispatchRecords 派车记录
     * @return 派车记录
     */
    @Override
    public List<DispatchRecords> selectDispatchRecordsList(DispatchRecords dispatchRecords)
    {
        return dispatchRecordsMapper.selectDispatchRecordsList(dispatchRecords);
    }

    /**
     * 新增派车记录
     * 
     * @param dispatchRecords 派车记录
     * @return 结果
     */
    @Override
    public int insertDispatchRecords(DispatchRecords dispatchRecords)
    {
        return dispatchRecordsMapper.insertDispatchRecords(dispatchRecords);
    }

    /**
     * 修改派车记录
     * 
     * @param dispatchRecords 派车记录
     * @return 结果
     */
    @Override
    public int updateDispatchRecords(DispatchRecords dispatchRecords)
    {
        return dispatchRecordsMapper.updateDispatchRecords(dispatchRecords);
    }

    /**
     * 批量删除派车记录
     * 
     * @param ids 需要删除的派车记录主键
     * @return 结果
     */
    @Override
    public int deleteDispatchRecordsByIds(Long[] ids)
    {
        return dispatchRecordsMapper.deleteDispatchRecordsByIds(ids);
    }

    /**
     * 删除派车记录信息
     * 
     * @param id 派车记录主键
     * @return 结果
     */
    @Override
    public int deleteDispatchRecordsById(Long id)
    {
        return dispatchRecordsMapper.deleteDispatchRecordsById(id);
    }
}
