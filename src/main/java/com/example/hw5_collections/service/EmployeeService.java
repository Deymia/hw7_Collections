package com.example.hw5_collections.service;

import com.example.hw5_collections.exceptions.EmployeeAlreadyAddedException;
import com.example.hw5_collections.exceptions.EmployeeNotFoundException;
import com.example.hw5_collections.exceptions.EmployeeStorageIsFullException;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class EmployeeService {
    List<Employee> employees = new ArrayList<>(10);

    public Employee addEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (!employees.contains(employee)) {
            employees.add(employee);
            if (employees.size()>10){
                throw new EmployeeStorageIsFullException("Storage is full");
            }
        } else {
            throw new EmployeeAlreadyAddedException("Employee is already contains");
        }
        return employee;
    }

    public Employee deliteEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.contains(employee)) {
            employees.remove(employee);
        } else {
            throw new EmployeeNotFoundException("Employee not found");
        }
        return(employee);
    }


    public Employee searchEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.contains(employee)) {
            return employee;
        } else {
            throw new EmployeeNotFoundException("Employee not found");
        }
    }
}
