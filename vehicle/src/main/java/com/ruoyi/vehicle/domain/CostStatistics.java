package com.ruoyi.vehicle.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 费用统计对象 t_cost_statistics
 * 
 * @author me
 * @date 2025-04-05
 */
public class CostStatistics extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 费用记录ID，自动递增的主键 */
    private Long id;

    /** 相关车辆ID，关联vehicles表 */
    @Excel(name = "相关车辆ID，关联vehicles表")
    private Long vehicleId;

    /** 费用产生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "费用产生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date costDate;

    /** 费用类型：加油费、维修保养或其他 */
    @Excel(name = "费用类型：加油费、维修保养或其他")
    private String costType;

    /** 费用描述 */
    @Excel(name = "费用描述")
    private String description;

    /** 费用金额，保留两位小数 */
    @Excel(name = "费用金额，保留两位小数")
    private BigDecimal amount;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setVehicleId(Long vehicleId) 
    {
        this.vehicleId = vehicleId;
    }

    public Long getVehicleId() 
    {
        return vehicleId;
    }

    public void setCostDate(Date costDate) 
    {
        this.costDate = costDate;
    }

    public Date getCostDate() 
    {
        return costDate;
    }

    public void setCostType(String costType) 
    {
        this.costType = costType;
    }

    public String getCostType() 
    {
        return costType;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setAmount(BigDecimal amount) 
    {
        this.amount = amount;
    }

    public BigDecimal getAmount() 
    {
        return amount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("vehicleId", getVehicleId())
            .append("costDate", getCostDate())
            .append("costType", getCostType())
            .append("description", getDescription())
            .append("amount", getAmount())
            .toString();
    }
}
