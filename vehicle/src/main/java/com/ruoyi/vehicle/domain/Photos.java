package com.ruoyi.vehicle.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 车辆照片对象 t_photos
 * 
 * @author me
 * @date 2025-04-05
 */
public class Photos extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 照片ID，自动递增的主键 */
    private Long id;

    /** 相关车辆ID，关联vehicles表 */
    @Excel(name = "相关车辆ID，关联vehicles表")
    private Long vehicleId;
    private String plateNumber;

    /** 拍摄用户ID，关联users表 */
    @Excel(name = "拍摄用户ID，关联users表")
    private Long userId;
    private String username;

    /** 照片存储路径 */
    @Excel(name = "照片存储路径")
    private String photoPath;

    /** 拍摄时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "拍摄时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date shootTime;

    /** 拍摄类型：出车前或返回时 */
    @Excel(name = "拍摄类型：出车前或返回时")
    private String shootType;

    /** 记录创建时间，默认为当前时间戳 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录创建时间，默认为当前时间戳", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdAt;

    public String getVehicle() {
        return plateNumber;
    }

    public void setVehicle(String vehicle) {
        this.plateNumber = vehicle;
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

    public void setPhotoPath(String photoPath) 
    {
        this.photoPath = photoPath;
    }

    public String getPhotoPath() 
    {
        return photoPath;
    }

    public void setShootTime(Date shootTime) 
    {
        this.shootTime = shootTime;
    }

    public Date getShootTime() 
    {
        return shootTime;
    }

    public void setShootType(String shootType) 
    {
        this.shootType = shootType;
    }

    public String getShootType() 
    {
        return shootType;
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
            .append("photoPath", getPhotoPath())
            .append("shootTime", getShootTime())
            .append("shootType", getShootType())
            .append("remark", getRemark())
            .append("createdAt", getCreatedAt())
            .toString();
    }
}
