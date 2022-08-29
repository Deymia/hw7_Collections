package com.example.hw5_collections.service;

import com.example.hw5_collections.exceptions.EmployeeAlreadyAddedException;
import com.example.hw5_collections.exceptions.EmployeeNotFoundException;
import com.example.hw5_collections.exceptions.EmployeeStorageIsFullException;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.*;

@Service
public class EmployeeService {

    private final List<Employee> employees = new ArrayList<>(10);
    private final Map <String, Employee> employeeMap = new HashMap<>(10);

    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getMiddleName(), employee);
    }

    public Employee deleteEmployee(String firstName, String lastName, String middleName) {
        Employee empl = searchEmployee(firstName, lastName, middleName);
        employeeMap.remove(empl);
        return empl;
    }


    public Employee searchEmployee(String firstName, String lastName, String middleName) {
        Employee employee = new Employee(firstName, lastName, middleName);
        if (employees.contains(employee)) {
            return employee;
        } else {
            throw new EmployeeNotFoundException("Employee not found");
        }
    }
}
