package com.ruoyi.vehicle.domain;


public class CarReturnInfo {

    private Long id;

    private Long useId;

    /** 本次行驶里程（单位：公里） */
    private double mileage;

    /** 燃油费（单位：元） */
    private double fuelCost;

    /** 保养费（单位：元） */
    private double maintenanceCost;


    // Getter & Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUseId() {
        return useId;
    }

    public void setUseId(Long useId) {
        this.useId = useId;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelCost() {
        return fuelCost;
    }

    public void setFuelCost(double fuelCost) {
        this.fuelCost = fuelCost;
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }
}
