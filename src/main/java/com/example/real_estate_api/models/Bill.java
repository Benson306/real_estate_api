package com.example.real_estate_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "billing")
public class Bill {
    @Id
    private int id;
    private int tenantId;
    private int apartmentId;
    private int houseUnitId;
    private String month;
    private LocalDateTime billingTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    public int getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }

    public int getHouseUnitId() {
        return houseUnitId;
    }

    public void setHouseUnitId(int houseUnitId) {
        this.houseUnitId = houseUnitId;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public LocalDateTime getBillingTime() {
        return billingTime;
    }

    public void setBillingTime(LocalDateTime billingTime) {
        this.billingTime = billingTime;
    }
}
