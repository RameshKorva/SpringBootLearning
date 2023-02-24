package com.dailycode.department.service;

import com.dailycode.department.entity.Department;
import com.dailycode.department.repositary.DepartmentRepositary;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepositary departmentRepositary;

    public Department saveDepartment(Department department) {
        log.info("I'm in service layer --> saveDepartment method");
        return departmentRepositary.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        return departmentRepositary.findByDepartmentId(departmentId);
    }

    public List<Department> getAllDepartments() {
        return departmentRepositary.findAll();
    }
}
