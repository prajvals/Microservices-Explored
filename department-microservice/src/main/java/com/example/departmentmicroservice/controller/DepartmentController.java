package com.example.departmentmicroservice.controller;

import com.example.departmentmicroservice.entity.Department;
import com.example.departmentmicroservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public Department saveDepartment(@RequestBody Department department)
    {
        log.info("Inside department of the department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId)
    {
        log.info("Inside the controller layer findDepartmentById function");
        return departmentService.findDepartmentById(departmentId);
    }

}
