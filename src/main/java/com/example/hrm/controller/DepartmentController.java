package com.example.hrm.controller;

import com.example.hrm.dto.DepartmentDTO;
import com.example.hrm.entity.Department;
import com.example.hrm.service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/departments") //
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping //
    public ResponseEntity<Department> createDepartment(
            @Valid @RequestBody DepartmentDTO departmentDTO) { //
        Department savedDepartment = departmentService.createDepartment(departmentDTO);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED); // Trả về 201 Created khi thành công
    }
}