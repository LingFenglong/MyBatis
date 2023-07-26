package com.lingfenglong.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.lingfenglong.ssm.pojo.Employee;
import com.lingfenglong.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee/page/{pageNum}")
    public String getEmployeePage(@PathVariable("pageNum") Integer pageNum, Model model) {
        // 获取分页信息
        PageInfo<Employee> page = employeeService.getEmployeePage(pageNum);
        model.addAttribute("page", page);
        return "employee_page";
    }

    @GetMapping("/employee")
    public String getAllEmployee(Model model) {
        List<Employee> employees =  employeeService.getAllEmployee();
        model.addAttribute("employees", employees);
        return "employee_list";
    }

    @GetMapping("/employee/{employeeId}")
    public String getEmployeeById(@PathVariable("employeeId") Integer employeeId, Model model) {
        Employee employee =  employeeService.getEmployeeById(employeeId);
        model.addAttribute("employee", employee);
        return "employee_info";
    }

    @DeleteMapping("/employee/{employeeId}")
    public String deleteEmployeeById(@PathVariable("employeeId") Integer employeeId, @RequestParam("url") String url) {
        employeeService.deleteEmployeeById(employeeId);
        System.out.println("redirect:" + url);
        return "redirect:" + url;
    }

    @PutMapping("/employee")
    public String updateEmployee(Map<String, Object> map) {
        System.out.println(map);
        return "redirect:/employee/page/1";
    }
}
