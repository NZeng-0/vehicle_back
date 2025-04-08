package com.ruoyi.vehicle.mapper;

import java.util.List;
import com.ruoyi.vehicle.domain.DispatchRecords;
import org.apache.ibatis.annotations.Mapper;

/**
 * 派车记录Mapper接口
 * 
 * @author me
 * @date 2025-04-05
 */
@Mapper
public interface DispatchRecordsMapper 
{
    /**
     * 查询派车记录
     * 
     * @param id 派车记录主键
     * @return 派车记录
     */
    public DispatchRecords selectDispatchRecordsById(Long id);

    /**
     * 查询派车记录列表
     * 
     * @param dispatchRecords 派车记录
     * @return 派车记录集合
     */
    public List<DispatchRecords> selectDispatchRecordsList(DispatchRecords dispatchRecords);

    /**
     * 新增派车记录
     * 
     * @param dispatchRecords 派车记录
     * @return 结果
     */
    public int insertDispatchRecords(DispatchRecords dispatchRecords);

    /**
     * 修改派车记录
     * 
     * @param dispatchRecords 派车记录
     * @return 结果
     */
    public int updateDispatchRecords(DispatchRecords dispatchRecords);

    /**
     * 删除派车记录
     * 
     * @param id 派车记录主键
     * @return 结果
     */
    public int deleteDispatchRecordsById(Long id);

    /**
     * 批量删除派车记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDispatchRecordsByIds(Long[] ids);
}
