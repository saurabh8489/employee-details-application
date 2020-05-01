package com.employee.employeedetails.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeDetailService {

	public String getDetails(String emailId) {
		return "Email id of the employee is " + emailId;
	}

}
