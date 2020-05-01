package com.employee.employeedetails.service;

public class EmployeeResponse {
	public String emailId;
	public String moduleName;

	public EmployeeResponse(String emailId, String moduleName) {
		this.emailId = emailId;
		this.moduleName = moduleName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	@Override
	public String toString() {
		return "EmployeeResponse [emailId=" + emailId + ", ModuleName=" + moduleName + "]";
	}

}
