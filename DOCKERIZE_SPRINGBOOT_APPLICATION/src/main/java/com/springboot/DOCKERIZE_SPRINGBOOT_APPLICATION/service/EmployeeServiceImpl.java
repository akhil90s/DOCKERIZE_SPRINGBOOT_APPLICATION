package com.springboot.DOCKERIZE_SPRINGBOOT_APPLICATION.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.DOCKERIZE_SPRINGBOOT_APPLICATION.model.Employee;
import com.springboot.DOCKERIZE_SPRINGBOOT_APPLICATION.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {

        return employeeRepository.findAll();
    }

    @Override
    public void createEmployeeDetails(Employee employee) {
        
        employeeRepository.save(employee);
        
    }

}
