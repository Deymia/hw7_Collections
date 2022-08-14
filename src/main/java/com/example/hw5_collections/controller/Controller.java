package com.example.hw5_collections.controller;

import com.example.hw5_collections.service.Employee;
import com.example.hw5_collections.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class Controller {

    private final EmployeeService employeeService;

    public Controller(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee add(@RequestParam(name = "firstName") String firstName,
                        @RequestParam(name = "lastName") String lastName) {
        employeeService.addEmployee(firstName, lastName);
        return new Employee(firstName, lastName);
    }

    @GetMapping("/find")
    public Employee find(@RequestParam(name = "firstName") String firstName,
                         @RequestParam(name = "lastName") String lastName) {
        return employeeService.searchEmployee(firstName, lastName);
    }

    @GetMapping("/delete")
    public Employee delete(@RequestParam(name = "firstName") String firstName,
                           @RequestParam(name = "lastName") String lastName) {
        return employeeService.deliteEmployee(firstName, lastName);
    }

}
