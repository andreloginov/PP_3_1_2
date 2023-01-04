package com.maksim.spring.service;


import com.maksim.spring.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmpFromId(int id);
    public void deleteEmployee(int id);
}
