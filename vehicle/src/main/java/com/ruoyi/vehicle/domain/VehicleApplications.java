package com.ruoyi.vehicle.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 车辆申请对象 t_vehicle_applications
 * 
 * @author me
 * @date 2025-04-05
 */
public class VehicleApplications extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 申请ID，自动递增的主键 */
    private Long id;

    /** 申请用户ID，关联users表 */
    @Excel(name = "申请用户ID，关联users表")
    private Long userId;

    /** 申请车辆ID，关联vehicles表 */
    @Excel(name = "申请车辆ID，关联vehicles表")
    private Long vehicleId;

    /** 申请日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applyDate;

    /** 用车开始时间 */
    @JsonFormat(pattern = "HH:mm")
    private Date startTime;

    /** 用车结束时间 */
    @JsonFormat(pattern = "HH:mm")
    private Date endTime;

    /** 同行人员信息 */
    @Excel(name = "同行人员信息")
    private String companions;

    /** 用车理由 */
    @Excel(name = "用车理由")
    private String reason;

    /** 出发地点 */
    @Excel(name = "出发地点")
    private String startLocation;

    /** 目的地点 */
    @Excel(name = "目的地点")
    private String endLocation;

    /** 申请状态：待审核、已批准或已拒绝 */
    @Excel(name = "申请状态：待审核、已批准或已拒绝")
    private String status;

    /** 申请创建时间，默认为当前时间戳 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请创建时间，默认为当前时间戳", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    private String username;
    private String plateNumber;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setVehicleId(Long vehicleId) 
    {
        this.vehicleId = vehicleId;
    }

    public Long getVehicleId() 
    {
        return vehicleId;
    }

    public void setApplyDate(Date applyDate) 
    {
        this.applyDate = applyDate;
    }

    public Date getApplyDate() 
    {
        return applyDate;
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

    public void setCompanions(String companions) 
    {
        this.companions = companions;
    }

    public String getCompanions() 
    {
        return companions;
    }

    public void setReason(String reason) 
    {
        this.reason = reason;
    }

    public String getReason() 
    {
        return reason;
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

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
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
            .append("userId", getUserId())
            .append("vehicleId", getVehicleId())
            .append("applyDate", getApplyDate())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("companions", getCompanions())
            .append("reason", getReason())
            .append("startLocation", getStartLocation())
            .append("endLocation", getEndLocation())
            .append("status", getStatus())
            .append("createdAt", getCreatedAt())
            .toString();
    }
}
