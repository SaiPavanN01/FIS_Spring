package com.fis.springlearn.dao;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeDao {
	private static final Logger LOGGER=(Logger) LoggerFactory.getLogger(EmployeeDao.class);
	public EmployeeDao()
	{
		LOGGER.debug("Inside Employee Dao");
	}

}
