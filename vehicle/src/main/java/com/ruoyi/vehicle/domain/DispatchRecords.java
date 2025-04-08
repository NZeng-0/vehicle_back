package com.ruoyi.vehicle.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 派车记录对象 t_dispatch_records
 * 
 * @author me
 * @date 2025-04-05
 */
public class DispatchRecords extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 派车记录ID，自动递增的主键 */
    private Long id;

    /** 派出车辆ID，关联vehicles表 */
    @Excel(name = "派出车辆ID，关联vehicles表")
    private Long vehicleId;

    /** 用车人ID，关联users表 */
    @Excel(name = "用车人ID，关联users表")
    private Long userId;

    /** 用车原因 */
    @Excel(name = "用车原因")
    private String useReason;

    /** 开始用车时间 */
    @JsonFormat(pattern = "HH:mm")
    private Date startTime;

    /** 结束用车时间 */
    @JsonFormat(pattern = "HH:mm")
    private Date endTime;

    /** 出发地点 */
    @Excel(name = "出发地点")
    private String startLocation;

    /** 目的地点 */
    @Excel(name = "目的地点")
    private String endLocation;

    /** 记录创建时间，默认为当前时间戳 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录创建时间，默认为当前时间戳", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

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

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setUseReason(String useReason) 
    {
        this.useReason = useReason;
    }

    public String getUseReason() 
    {
        return useReason;
    }

    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }

    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }

    public void setStartLocation(String startLocation) 
    {
        this.startLocation = startLocation;
    }

    public String getStartLocation() 
    {
        return startLocation;
    }

    public void setEndLocation(String endLocation) 
    {
        this.endLocation = endLocation;
    }

    public String getEndLocation() 
    {
        return endLocation;
    }

    public void setCreatedAt(Date createdAt) 
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() 
    {
        return createdAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("vehicleId", getVehicleId())
            .append("userId", getUserId())
            .append("useReason", getUseReason())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("startLocation", getStartLocation())
            .append("endLocation", getEndLocation())
            .append("createdAt", getCreatedAt())
            .toString();
    }
}
