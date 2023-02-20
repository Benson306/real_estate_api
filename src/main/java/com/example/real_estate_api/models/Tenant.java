package com.example.real_estate_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tenants")
public class Tenant {
    @Id
    private int id;
    private String fullName;
    private String email;
    private Long phoneNumber;
    private int houseNumberId;
    private int apartmentId;
    private String status;
    private String movedInOn;
    private String lastBilledMonth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMovedInOn() {
        return movedInOn;
    }

    public void setMovedInOn(String movedInOn) {
        this.movedInOn = movedInOn;
    }

    public String getLastBilledMonth() {
        return lastBilledMonth;
    }

    public void setLastBilledMonth(String lastBilledMonth) {
        this.lastBilledMonth = lastBilledMonth;
    }

    public int getHouseNumberId() {
        return houseNumberId;
    }

    public void setHouseNumberId(int houseNumber) {
        this.houseNumberId = houseNumber;
    }

    public int getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(int apartment) {
        this.apartmentId = apartment;
    }
}
