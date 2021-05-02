package com.springboot.DOCKERIZE_SPRINGBOOT_APPLICATION.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.DOCKERIZE_SPRINGBOOT_APPLICATION.model.Employee;



@Service
public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void createEmployeeDetails(Employee employee);

}
