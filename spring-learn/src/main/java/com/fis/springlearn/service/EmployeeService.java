package com.fis.springlearn.service;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;

import com.fis.springlearn.dao.EmployeeDao;

public class EmployeeService {
	private static final Logger LOGGER=(Logger) LoggerFactory.getLogger(EmployeeService.class);
	private EmployeeDao employeeDao;
	public EmployeeService() {
		LOGGER.debug("Inside Employee Service");
	}
	public void setEmployeeService(EmployeeDao employeeDao)
	{
		this.employeeDao=employeeDao;
	}
}
