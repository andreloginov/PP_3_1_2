package com.maksim.spring.controller;

import com.maksim.spring.entity.Employee;
import com.maksim.spring.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MyController {
    private final EmployeeService employeeService;
    public MyController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public String showAllEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "show_all_employees";
    }














    @GetMapping("/employees/{id}")
    public Employee showSingleEmployee(@PathVariable int id) {
        return employeeService.getEmpFromId(id);
    }

    @PostMapping("/employees")
    public Employee saveAnEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateAnEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {

        employeeService.deleteEmployee(id);
        return "The employee whose id is " + id + " has been deleted";
    }
}
