package com.ruoyi.vehicle.service;

import java.util.List;
import com.ruoyi.vehicle.domain.CostStatistics;

public interface ICostStatisticsService 
{
    /**
     * 查询费用
     * 
     * @param id 主键
     * @return 费用
     */
    public CostStatistics selectCostStatisticsById(Long id);

    /**
     * 查询费用列表
     * 
     * @param costStatistics 费用信息
     * @return 费用集合
     */
    public List<CostStatistics> selectCostStatisticsList(CostStatistics costStatistics);

    /**
     * 新增费用
     * 
     * @param costStatistics 费用信息
     * @return 结果
     */
    public int insertCostStatistics(CostStatistics costStatistics);

    /**
     * 修改费用
     * 
     * @param costStatistics 费用信息
     * @return 结果
     */
    public int updateCostStatistics(CostStatistics costStatistics);

    /**
     * 批量删除费用
     * 
     * @param ids 需要删除的主键集合
     * @return 结果
     */
    public int deleteCostStatisticsByIds(Long[] ids);

    /**
     * 删除费用信息
     * 
     * @param id 主键
     * @return 结果
     */
    public int deleteCostStatisticsById(Long id);
}
