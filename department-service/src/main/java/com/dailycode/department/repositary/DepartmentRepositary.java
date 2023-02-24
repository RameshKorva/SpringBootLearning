package com.dailycode.department.repositary;

import com.dailycode.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositary extends JpaRepository<Department, Long> {
    Department findByDepartmentId(Long departmentId);
}
