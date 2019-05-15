package com.cts.services;

import com.cts.dao.PharmacyDAOImpl;

public class PharmacyServiceImpl implements PharmacyService {
	
    PharmacyDAOImpl pharmacyDAO;
    
    
	public PharmacyServiceImpl(String jdbcDriver, String jdbcUsername, String jdbcPassword,String jdbcURL) {
		super();
		pharmacyDAO = new PharmacyDAOImpl(jdbcDriver, jdbcUsername, jdbcPassword, jdbcURL);
	}
  
	
}
