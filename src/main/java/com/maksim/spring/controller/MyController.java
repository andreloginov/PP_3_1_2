package com.maksim.spring.controller;

import com.maksim.spring.entity.Employee;
import com.maksim.spring.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {
    private final EmployeeService employeeService;
    public MyController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public String showAllEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());

        return "employee-list";
    }

    @GetMapping("/employee-create")
    public String createEmployeeForm(Employee employee, Model model) {
        model.addAttribute("employee", employee);

        return "employee-create";
    }

    @PostMapping("/employee-create")
    public String createEmployee(Employee employee) {
        employeeService.saveEmployee(employee);

        return "redirect:/employees";
    }
    @GetMapping("employee-delete/{id}")
    public String deleteEmployee(@PathVariable("id") int id) {
        employeeService.deleteEmployee(id);

        return "redirect:/employees";
    }

    @GetMapping("/employee-update/{id}")
    public String updateEmployeeForm(@PathVariable("id") int id, Model model) {
        model.addAttribute("employee", employeeService.getEmpFromId(id));

        return "employee-update";
    }

    @PostMapping("/employee-update")
    public String updateEmployee(Employee employee) {
        employeeService.saveEmployee(employee);

        return "redirect:/employees";
    }

















    /*@GetMapping("/employees/{id}")
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
    }*/
}
