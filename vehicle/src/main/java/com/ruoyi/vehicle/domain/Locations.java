package com.ruoyi.vehicle.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 定位对象 t_locations
 * 
 * @author me
 * @date 2025-04-08
 */
public class Locations extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 位置记录ID，自动递增的主键 */
    private Long id;

    /** 车辆ID，关联vehicles表 */
    @Excel(name = "车辆ID，关联vehicles表")
    private Long vehicleId;

    /** 位置地址描述 */
    @Excel(name = "位置地址描述")
    private String address;

    /** 记录时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date recordedAt;

    /** 当前使用者ID，关联users表 */
    @Excel(name = "当前使用者ID，关联users表")
    private Long userId;

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

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setRecordedAt(Date recordedAt) 
    {
        this.recordedAt = recordedAt;
    }

    public Date getRecordedAt() 
    {
        return recordedAt;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("vehicleId", getVehicleId())
            .append("address", getAddress())
            .append("recordedAt", getRecordedAt())
            .append("userId", getUserId())
            .toString();
    }
}
