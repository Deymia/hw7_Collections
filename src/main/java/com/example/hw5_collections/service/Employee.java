package com.example.hw5_collections.service;

import com.example.hw5_collections.exceptions.EmployeeAlreadyAddedException;
import com.example.hw5_collections.exceptions.EmployeeNotFoundException;
import com.example.hw5_collections.exceptions.EmployeeStorageIsFullException;

import java.util.*;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String middleName;

    public String getMiddleName() {
        return middleName;
    }

    public Employee(String firsName, String lastName, String middleName) {
        this.firstName = firsName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(middleName, employee.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }

}
