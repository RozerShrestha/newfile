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
public class HouseOwner {
    private int howner_id;
    private String howner_name;
    private int howner_no;

    public HouseOwner() {
    }

    public HouseOwner(int howner_id, String howner_name, int howner_no) {
        this.howner_id = howner_id;
        this.howner_name = howner_name;
        this.howner_no = howner_no;
    }

    public int getHowner_id() {
        return howner_id;
    }

    public String getHowner_name() {
        return howner_name;
    }

    public int getHowner_no() {
        return howner_no;
    }

    public void setHowner_id(int howner_id) {
        this.howner_id = howner_id;
    }

    public void setHowner_name(String howner_name) {
        this.howner_name = howner_name;
    }

    public void setHowner_no(int howner_no) {
        this.howner_no = howner_no;
    }

    @Override
    public String toString() {
        return "HouseOwner{" + "howner_id=" + howner_id + ", howner_name=" + howner_name + ", howner_no=" + howner_no + '}';
    }
    
    
}
