package com.ruoyi.vehicle.mapper;

import java.util.List;
import com.ruoyi.vehicle.domain.CostStatistics;
import org.apache.ibatis.annotations.Mapper;

/**
 * 费用统计Mapper接口
 * 
 * @author me
 * @date 2025-04-05
 */
@Mapper
public interface CostStatisticsMapper 
{
    /**
     * 查询费用统计
     * 
     * @param id 费用统计主键
     * @return 费用统计
     */
    public CostStatistics selectCostStatisticsById(Long id);

    /**
     * 查询费用统计列表
     * 
     * @param costStatistics 费用统计
     * @return 费用统计集合
     */
    public List<CostStatistics> selectCostStatisticsList(CostStatistics costStatistics);

    /**
     * 新增费用统计
     * 
     * @param costStatistics 费用统计
     * @return 结果
     */
    public int insertCostStatistics(CostStatistics costStatistics);

    /**
     * 修改费用统计
     * 
     * @param costStatistics 费用统计
     * @return 结果
     */
    public int updateCostStatistics(CostStatistics costStatistics);

    /**
     * 删除费用统计
     * 
     * @param id 费用统计主键
     * @return 结果
     */
    public int deleteCostStatisticsById(Long id);

    /**
     * 批量删除费用统计
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCostStatisticsByIds(Long[] ids);
}
