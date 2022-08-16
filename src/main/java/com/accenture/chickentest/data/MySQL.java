/**
 *
 * @author facundo.campos
 */

package com.accenture.chickentest.data;

import com.accenture.chickentest.exceptions.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQL implements IDataManagement{
    String URL="";
    String dbUser="";
    String dbUserPsw="";
    Connection connection;
    Statement stmt;
    
    public MySQL(){
    }
    
    public MySQL(String dbUser, String dbUserPsw){
        this.dbUser = dbUser;
        this.dbUserPsw = dbUserPsw;
    }
    
    public MySQL(String host, int port,String dbName, 
                 boolean useSSL, boolean useTimezone,
                 String serverTimezone, boolean allowPublicKeyRetrival, 
                 String dbUser, String dbUserPsw){
                    // host=localhost - port=3306 - dbName="nameOfTheDatabase"
        this.URL = "jdbc:mysql://"+host+":"+port+"/"+dbName+"" 
                    // useSSL = false - useTimezone=true
                    +"?useSSL="+useSSL+"&useTimezone="+useTimezone
                    // serverTimezone= UTC
                    +"&serverTimezone="+serverTimezone
                    // allowPublicKeyRetrival= true
                    +"&allowPublicKeyRetrival="+allowPublicKeyRetrival;
        this.dbUser = dbUser;
        this.dbUserPsw = dbUserPsw;
    }

    @Override
    public Object openResource(String resourcepath) {
        Connection dbConnection = null;
        if (URL.equals("")) URL = resourcepath;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            dbConnection = DriverManager.getConnection(this.URL,this.dbUser,this.dbUserPsw);
            //this.stmt = dbConnection.createStatement();
            if (dbConnection != null ) System.out.println("Connection with the DB stablished...");
            else System.out.println("Connection with DB was NOT stablished...");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return dbConnection;
    }

    @Override
    public void closeResource(Object resource) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void create(Object resource, Object obj) throws DataAccessException {
        Connection dbConnection = (Connection) resource;
        try {
            this.stmt = dbConnection.createStatement();
            String sql = "INSER INTO " + obj.getClass().getName() + "(";
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void replace(Object resource, Object obj) throws WriteDataException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void modify(Object resource, Object obj) throws WriteDataException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void delete(Object resource, Object obj) throws DataAccessException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Object get() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String search(String fileName, String search) throws ReadDataException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Object> list(Object resource) throws ReadDataException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
