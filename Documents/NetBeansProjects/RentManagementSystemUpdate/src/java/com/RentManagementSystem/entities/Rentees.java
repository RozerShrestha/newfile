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
public class Rentees {
    private int renteeId;
    private String renteeName;
    private String parmanentAddress;
    private long phoneNo;
    private String email;
    private String rentDate;
    private boolean status;
    private String renteeImmidateContactName;
    private long renteeImmidateContactPhno;
    private String renteeInformation;

    public Rentees() {
    }

    public Rentees(int renteeId, String renteeName, String parmanentAddress, long phoneNo, String email, String rentDate, boolean status, String renteeImmidateContactName, long renteeImmidateContactPhno, String renteeInformation) {
        this.renteeId = renteeId;
        this.renteeName = renteeName;
        this.parmanentAddress = parmanentAddress;
        this.phoneNo = phoneNo;
        this.email = email;
        this.rentDate = rentDate;
        this.status = status;
        this.renteeImmidateContactName = renteeImmidateContactName;
        this.renteeImmidateContactPhno = renteeImmidateContactPhno;
        this.renteeInformation = renteeInformation;
    }

    public int getRenteeId() {
        return renteeId;
    }

    public String getRenteeName() {
        return renteeName;
    }

    public String getParmanentAddress() {
        return parmanentAddress;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public String getRentDate() {
        return rentDate;
    }

    public boolean isStatus() {
        return status;
    }

    public String getRenteeImmidateContactName() {
        return renteeImmidateContactName;
    }

    public long getRenteeImmidateContactPhno() {
        return renteeImmidateContactPhno;
    }

    public String getRenteeInformation() {
        return renteeInformation;
    }

    public void setRenteeId(int renteeId) {
        this.renteeId = renteeId;
    }

    public void setRenteeName(String renteeName) {
        this.renteeName = renteeName;
    }

    public void setParmanentAddress(String parmanentAddress) {
        this.parmanentAddress = parmanentAddress;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRentDate(String rentDate) {
        this.rentDate = rentDate;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setRenteeImmidateContactName(String renteeImmidateContactName) {
        this.renteeImmidateContactName = renteeImmidateContactName;
    }

    public void setRenteeImmidateContactPhno(long renteeImmidateContactPhno) {
        this.renteeImmidateContactPhno = renteeImmidateContactPhno;
    }

    public void setRenteeInformation(String renteeInformation) {
        this.renteeInformation = renteeInformation;
    }

    @Override
    public String toString() {
        return "Rentees{" + "renteeId=" + renteeId + ", renteeName=" + renteeName + ", parmanentAddress=" + parmanentAddress + ", phoneNo=" + phoneNo + ", email=" + email + ", rentDate=" + rentDate + ", status=" + status + ", renteeImmidateContactName=" + renteeImmidateContactName + ", renteeImmidateContactPhno=" + renteeImmidateContactPhno + ", renteeInformation=" + renteeInformation + '}';
    }

    
}