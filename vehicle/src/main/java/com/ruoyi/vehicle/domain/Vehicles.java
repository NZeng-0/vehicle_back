package com.ruoyi.vehicle.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 车辆信息对象 t_vehicles
 * 
 * @author me
 * @date 2025-04-05
 */
public class Vehicles extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 车辆ID，自动递增的主键 */
    private Long id;

    /** 车牌号，唯一标识符 */
    @Excel(name = "车牌号，唯一标识符")
    private String plateNumber;

    /** 车辆图片 */
    @Excel(name = "车辆图片")
    private String cover;

    /** 车辆品牌 */
    @Excel(name = "车辆品牌")
    private String brand;

    /** 车辆类型 */
    @Excel(name = "车辆类型")
    private String carType;

    /** 车辆颜色 */
    @Excel(name = "车辆颜色")
    private String color;

    /** 车辆里程数，单位：公里 */
    @Excel(name = "车辆里程数，单位：公里")
    private Long mileage;

    /** 车辆购买日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "车辆购买日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date purchaseDate;

    /** 最近一次维护保养日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最近一次维护保养日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastMaintenance;

    /** 保险到期日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "保险到期日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date insuranceExpiry;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setPlateNumber(String plateNumber) 
    {
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() 
    {
        return plateNumber;
    }

    public void setCover(String cover) 
    {
        this.cover = cover;
    }

    public String getCover() 
    {
        return cover;
    }

    public void setBrand(String brand) 
    {
        this.brand = brand;
    }

    public String getBrand() 
    {
        return brand;
    }

    public void setCarType(String carType) 
    {
        this.carType = carType;
    }

    public String getCarType() 
    {
        return carType;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public String getColor() 
    {
        return color;
    }

    public void setMileage(Long mileage) 
    {
        this.mileage = mileage;
    }

    public Long getMileage() 
    {
        return mileage;
    }

    public void setPurchaseDate(Date purchaseDate) 
    {
        this.purchaseDate = purchaseDate;
    }

    public Date getPurchaseDate() 
    {
        return purchaseDate;
    }

    public void setLastMaintenance(Date lastMaintenance) 
    {
        this.lastMaintenance = lastMaintenance;
    }

    public Date getLastMaintenance() 
    {
        return lastMaintenance;
    }

    public void setInsuranceExpiry(Date insuranceExpiry) 
    {
        this.insuranceExpiry = insuranceExpiry;
    }

    public Date getInsuranceExpiry() 
    {
        return insuranceExpiry;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("plateNumber", getPlateNumber())
            .append("cover", getCover())
            .append("brand", getBrand())
            .append("carType", getCarType())
            .append("color", getColor())
            .append("mileage", getMileage())
            .append("purchaseDate", getPurchaseDate())
            .append("lastMaintenance", getLastMaintenance())
            .append("insuranceExpiry", getInsuranceExpiry())
            .toString();
    }
}
