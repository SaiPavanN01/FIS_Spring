package com.fis.springlearn.controller;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.Message;
import org.slf4j.LoggerFactory;

import com.fis.springlearn.dao.EmployeeDao;
import com.fis.springlearn.service.EmployeeService;

public class EmployeeController {
	private static final Logger LOGGER=(Logger) LoggerFactory.getLogger(EmployeeDao.class);
	
	private EmployeeService employeeService;
	public EmployeeController()
	{
		LOGGER.debug("Inside Employee Controller");
	}
	public void setEmployeeeService(EmployeeService employeeService) {
		this.employeeService=employeeService;
	}


}
