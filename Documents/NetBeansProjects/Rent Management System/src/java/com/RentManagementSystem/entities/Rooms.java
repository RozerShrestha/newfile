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
public class Rooms {
    private int roomId;
    private String roomName;
    private int roomCharge;
    private boolean roomStatus;
    private float initialMeterReading;
    private float finalMeterReading;

    public Rooms() {
    }

    public Rooms(int roomId, String roomName, int roomCharge, boolean roomStatus, float initialMeterReading, float finalMeterReading) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.roomCharge = roomCharge;
        this.roomStatus = roomStatus;
        this.initialMeterReading = initialMeterReading;
        this.finalMeterReading = finalMeterReading;
    }

    
    public int getRoomId() {
        return roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public int getRoomCharge() {
        return roomCharge;
    }

    public boolean isRoomStatus() {
        return roomStatus;
    }

    public float getInitialMeterReading() {
        return initialMeterReading;
    }

    public float getFinalMeterReading() {
        return finalMeterReading;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setRoomCharge(int roomCharge) {
        this.roomCharge = roomCharge;
    }

    public void setRoomStatus(boolean roomStatus) {
        this.roomStatus = roomStatus;
    }

    public void setInitialMeterReading(float initialMeterReading) {
        this.initialMeterReading = initialMeterReading;
    }

    public void setFinalMeterReading(float finalMeterReading) {
        this.finalMeterReading = finalMeterReading;
    }

    @Override
    public String toString() {
        return "Rooms{" + "roomId=" + roomId + ", roomName=" + roomName + ", roomCharge=" + roomCharge + ", roomStatus=" + roomStatus + ", initialMeterReading=" + initialMeterReading + ", finalMeterReading=" + finalMeterReading + '}';
    }

   
   
    
    
}
