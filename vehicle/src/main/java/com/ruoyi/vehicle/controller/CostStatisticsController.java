package com.ruoyi.vehicle.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.vehicle.domain.CostStatistics;
import com.ruoyi.vehicle.service.ICostStatisticsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 费用统计Controller
 * 
 * @author me
 * @date 2025-04-05
 */
@RestController
@RequestMapping("/vehicle/statistics")
public class CostStatisticsController extends BaseController
{
    @Autowired
    private ICostStatisticsService costStatisticsService;

    /**
     * 查询费用统计列表
     */
    @GetMapping("/list")
    public TableDataInfo list(CostStatistics costStatistics)
    {
        startPage();
        List<CostStatistics> list = costStatisticsService.selectCostStatisticsList(costStatistics);
        return getDataTable(list);
    }

    /**
     * 获取费用统计详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(costStatisticsService.selectCostStatisticsById(id));
    }

    /**
     * 新增费用统计
     */
    @PostMapping
    public AjaxResult add(@RequestBody CostStatistics costStatistics)
    {
        return toAjax(costStatisticsService.insertCostStatistics(costStatistics));
    }

    @PostMapping("/add-more")
    public AjaxResult addMore(@RequestBody List<CostStatistics> costStatistics)
    {
        return toAjax(costStatisticsService.insertCostStatisticsMore(costStatistics));
    }

    /**
     * 修改费用统计
     */
    @PutMapping
    public AjaxResult edit(@RequestBody CostStatistics costStatistics)
    {
        return toAjax(costStatisticsService.updateCostStatistics(costStatistics));
    }

    /**
     * 删除费用统计
     */
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(costStatisticsService.deleteCostStatisticsByIds(ids));
    }
}
