package com.ruoyi.vehicle.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.vehicle.mapper.CostStatisticsMapper;
import com.ruoyi.vehicle.domain.CostStatistics;
import com.ruoyi.vehicle.service.ICostStatisticsService;

/**
 * 费用统计Service业务层处理
 * 
 * @author me
 * @date 2025-04-05
 */
@Service
public class CostStatisticsServiceImpl implements ICostStatisticsService 
{
    @Autowired
    private CostStatisticsMapper costStatisticsMapper;

    /**
     * 查询费用统计
     * 
     * @param id 费用统计主键
     * @return 费用统计
     */
    @Override
    public CostStatistics selectCostStatisticsById(Long id)
    {
        return costStatisticsMapper.selectCostStatisticsById(id);
    }

    /**
     * 查询费用统计列表
     * 
     * @param costStatistics 费用统计
     * @return 费用统计
     */
    @Override
    public List<CostStatistics> selectCostStatisticsList(CostStatistics costStatistics)
    {
        return costStatisticsMapper.selectCostStatisticsList(costStatistics);
    }

    /**
     * 新增费用统计
     * 
     * @param costStatistics 费用统计
     * @return 结果
     */
    @Override
    public int insertCostStatistics(CostStatistics costStatistics)
    {
        return costStatisticsMapper.insertCostStatistics(costStatistics);
    }

    @Override
    public int insertCostStatisticsMore(List<CostStatistics> list)
    {
        for(CostStatistics item : list){
            costStatisticsMapper.insertCostStatistics(item);
        }
        return 1;
    }

    /**
     * 修改费用统计
     * 
     * @param costStatistics 费用统计
     * @return 结果
     */
    @Override
    public int updateCostStatistics(CostStatistics costStatistics)
    {
        return costStatisticsMapper.updateCostStatistics(costStatistics);
    }

    /**
     * 批量删除费用统计
     * 
     * @param ids 需要删除的费用统计主键
     * @return 结果
     */
    @Override
    public int deleteCostStatisticsByIds(Long[] ids)
    {
        return costStatisticsMapper.deleteCostStatisticsByIds(ids);
    }

    /**
     * 删除费用统计信息
     * 
     * @param id 费用统计主键
     * @return 结果
     */
    @Override
    public int deleteCostStatisticsById(Long id)
    {
        return costStatisticsMapper.deleteCostStatisticsById(id);
    }

    @Override
    public List<CostStatistics> selectListByCarId(Long carId){
        List<CostStatistics> costStatistics = costStatisticsMapper.selectListByCarId(carId);
        return costStatistics;
    }
}
