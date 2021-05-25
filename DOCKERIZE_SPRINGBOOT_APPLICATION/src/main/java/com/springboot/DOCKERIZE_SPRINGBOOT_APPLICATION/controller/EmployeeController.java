package com.springboot.DOCKERIZE_SPRINGBOOT_APPLICATION.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.DOCKERIZE_SPRINGBOOT_APPLICATION.model.Employee;
import com.springboot.DOCKERIZE_SPRINGBOOT_APPLICATION.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/getAllEmployees")
    public List<Employee> getAllEmployees() {

        return employeeService.getAllEmployees();

    }

    @PostMapping(value = "/employee")
    public ResponseEntity<String> createEmployeeDetails(@RequestBody Employee employee) {
    	
    	employeeService.createEmployeeDetails(employee);
        return new ResponseEntity<String>("Successfull", HttpStatus.OK);

    }
    
    @GetMapping(value = "/ping")
    public String ping() {

        return "Ping Service";

    }

}
