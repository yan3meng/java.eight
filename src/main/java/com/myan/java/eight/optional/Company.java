package com.myan.java.eight.optional;

import java.util.List;

/**
 * Created by myan on 2018/8/16 7:48.
 */
public class Company {

    private String name;

    private List<Employee> employeeList;

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
