/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.RentManagementSystem.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rozer Shrestha
 */
public class DBConnection {

    Connection connection = null;
    PreparedStatement statement = null;

    public void open() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/rentmanagementsystem", "root", "");

    }
    public PreparedStatement initStatement(String sql) throws SQLException
    {
        statement=connection.prepareStatement(sql);
        return statement;
        
    }
    public int executeUpdate() throws SQLException {
        return statement.executeUpdate();
    }

    public ResultSet executeQuery() throws SQLException {
        return statement.executeQuery();
    }

    public void close() throws SQLException {
        if (!connection.isClosed()) {
            connection.close();
            connection = null;
        }
    }
}
    
