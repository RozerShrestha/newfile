/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.RentManagementSystem.entities;

/**
 *
 * @author Rozer Shrestha
 */
public class Houses {
    private int houseId;
    private String houseName;
    private String houseAddress;
    private boolean houseStatus;

    public Houses() {
    }

    public Houses(int houseId, String houseName, String houseAddress, boolean houseStatus) {
        this.houseId = houseId;
        this.houseName = houseName;
        this.houseAddress = houseAddress;
        this.houseStatus = houseStatus;
    }

    public int getHouseId() {
        return houseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public boolean isHouseStatus() {
        return houseStatus;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public void setHouseStatus(boolean houseStatus) {
        this.houseStatus = houseStatus;
    }

    @Override
    public String toString() {
        return "Houses{" + "houseId=" + houseId + ", houseName=" + houseName + ", houseAddress=" + houseAddress + ", houseStatus=" + houseStatus + '}';
    }

    
}
