/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ade Mulyana
 */
public class dbConnection {
    private Statement stmt = null;
    private Connection conn = null;
    
    public dbConnection() {
        String ConAddress = "jdbc:mysql://localhost/db_music";
        String user = "root";
        String pass = "";
        connect(ConAddress, user, pass);
    }
    
    private void connect(String ConAddress, String user, String pass) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(ConAddress, user, pass);
            stmt = conn.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // for SELECT query
    public ResultSet selectQuery(String sql){
        try {
            stmt.executeQuery(sql);
            return stmt.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    // for INSERT, UPDATE, DELETE query
    public int updateQuery(String sql){
        try {
            return stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public Statement getStmt() {
        return stmt;
    }
    
    public Connection getConn(){
        return conn;
    }
}
