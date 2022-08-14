package com.example.hw5_collections.service;

import com.example.hw5_collections.exceptions.EmployeeAlreadyAddedException;
import com.example.hw5_collections.exceptions.EmployeeNotFoundException;
import com.example.hw5_collections.exceptions.EmployeeStorageIsFullException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String lastName;

    public Employee(String firsName, String lastName) {
        this.firstName = firsName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firsName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
