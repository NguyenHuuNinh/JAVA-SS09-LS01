package com.example.hrm.service;

import com.example.hrm.dto.DepartmentDTO;
import com.example.hrm.entity.Department;
import com.example.hrm.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department createDepartment(DepartmentDTO dto) {
        Department department = new Department();
        department.setName(dto.getName());
        department.setDescription(dto.getDescription());
        return departmentRepository.save(department);
    }
}