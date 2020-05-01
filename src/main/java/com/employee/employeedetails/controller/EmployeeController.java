package com.employee.employeedetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeedetails.service.EmployeeDetailService;
import com.employee.employeedetails.service.EmployeeResponse;

@RestController
@RequestMapping(path = "/employeedetails")
public class EmployeeController {
	public static String MODULE_NAME = "Employee-Details-Application";

	@Autowired
	public EmployeeDetailService employeeDetailService;

	@GetMapping
	public ResponseEntity<EmployeeResponse> getEmployeeEmail(@RequestParam(name = "empEmail") String empEmail) {
		String result = employeeDetailService.getDetails(empEmail);
		return ResponseEntity.ok(new EmployeeResponse(result, MODULE_NAME));
	}
}
