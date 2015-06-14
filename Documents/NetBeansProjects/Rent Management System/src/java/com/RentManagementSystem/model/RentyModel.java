/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.RentManagementSystem.model;

import com.RentManagementSystem.db.DBConnection;
import com.RentManagementSystem.entities.Rentees;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Rozer Shrestha
 */
public class RentyModel {
    public static int Insert(Rentees rentees) throws ClassNotFoundException, SQLException
    {
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="INSERT INTO rentees(rentee_name,phone_no,email,parmanent_address,rent_date,status,rentee_immidate_contact_name,rentee_immidate_contact_phno,rentee_information) VALUES(??????????)";
        PreparedStatement statement=connection.initStatement(sql);
        statement.setString(1,rentees.getRenteeName());
        statement.setInt(2, rentees.getPhoneNo());
        statement.setString(3, rentees.getEmail());
        statement.setString(4, rentees.getParmanentAddress());
        statement.setString(5, rentees.getRentDate());
        statement.setBoolean(6, rentees.isStatus());
        statement.setString(7, rentees.getRenteeImmidateContactName());
        statement.setInt(8, rentees.getRenteeImmidateContactPhno());
        statement.setString(9, rentees.getRenteeInformation());
        int result=connection.executeUpdate();
        
        return result;  
    }
    
    public static int Update(Rentees rentees) throws ClassNotFoundException, SQLException
    {
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="UPDATE rentees SET rentee_name=?, phone_no=?, email=?, parmanent_address=?, rent_date=?, status=?, rentee_immidate_contact_name=?, rentee_immidate_contact_phno=?, rentee_information=? WHERE rentee_id=?";
        PreparedStatement statement=connection.initStatement(sql);
        statement.setString(1, rentees.getRenteeName());
        statement.setInt(2,rentees.getPhoneNo());
        statement.setString(3, rentees.getEmail());
        statement.setString(4, rentees.getParmanentAddress());
         statement.setString(5, rentees.getRentDate());
        statement.setBoolean(6, rentees.isStatus());
        statement.setString(7, rentees.getRenteeImmidateContactName());
        statement.setInt(8, rentees.getRenteeImmidateContactPhno());
        statement.setString(9, rentees.getRenteeInformation());
        int result=connection.executeUpdate();
        
        return result;
    }
    
    public static int Delete(Integer id ) throws ClassNotFoundException, SQLException
    {
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="DELETE FROM rentees WHERE rentee_id=?";
        PreparedStatement statement=connection.initStatement(sql);
        statement.setString(1,id.toString());
        int result=connection.executeUpdate();
        connection.close();
        return result;
    }
    public static ArrayList<Rentees> getAll() throws ClassNotFoundException, SQLException
    {
        DBConnection connection=new DBConnection();
        connection.open();
        ArrayList<Rentees> rentees=new ArrayList<Rentees>();
        String sql="SELECT * FROM rentees";
        PreparedStatement statement=connection.initStatement(sql);
        ResultSet rs=connection.executeQuery();
        while(rs.next())
        {
                Rentees r=new Rentees();
                r.setRenteeId(Integer.parseInt(rs.getString("rentee_id")));
                r.setRenteeName(rs.getString("rentee_name"));
                r.setPhoneNo(Integer.parseInt(rs.getString("phone_no")));
                r.setEmail(rs.getString("email"));
                r.setParmanentAddress(rs.getString("parmanent_address"));
                r.setRentDate(rs.getString("rent_date"));
                r.setStatus(rs.getBoolean("status"));
                r.setRenteeImmidateContactName(rs.getString("rentee_immidate_contact_name"));
                r.setRenteeImmidateContactPhno(Integer.parseInt(rs.getString("rentee_immidate_contact_phno")));
                r.setRenteeInformation(rs.getString("rentee_information"));
                rentees.add(r);
        }
        connection.close();
        return rentees ;
    }
}
