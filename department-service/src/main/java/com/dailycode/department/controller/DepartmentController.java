package com.dailycode.department.controller;

import com.dailycode.department.entity.Department;
import com.dailycode.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("I'm going to save department --> savedepartment controller method");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("I'm going to finddepartment by id --> findDepartmentById controller method");
        return departmentService.findDepartmentById(departmentId);
    }

    @GetMapping
    public List<Department> getAllDepartments() {
        log.info("I'm going to getAllDepartments --> getAllDepartments controller method");
        return departmentService.getAllDepartments();
    }
}
