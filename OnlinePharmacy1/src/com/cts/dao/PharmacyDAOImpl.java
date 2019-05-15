package com.cts.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class PharmacyDAOImpl implements PharmacyDAO {

	public PharmacyDAOImpl() {
		super();
	
	}
	
	
	public PharmacyDAOImpl(String jdbcDriver, String jdbcUsername, String jdbcPassword, String jdbcURL) {
		Connection connection = getConnection(jdbcDriver,jdbcUsername,jdbcPassword,jdbcURL);
	}
	
	
	
	public Connection getConnection(String jdbcDriver, String jdbcUsername, String jdbcPassword, String jdbcURL){  
        Connection con=null;  
        try{  
        	Class.forName(jdbcDriver);  
            con=DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);  
        }catch(Exception e){System.err.print(e);}  
        return con;  
    }

}
