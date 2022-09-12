package com.example.departmentmicroservice.service;

import com.example.departmentmicroservice.entity.Department;
import com.example.departmentmicroservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department findDepartmentById(Long departmentId) {
        log.info("inside the service layer function findByDepartmentId");
        return departmentRepository.findById(departmentId).get();
    }

    public Department saveDepartment(Department department) {
        log.info("Inside the service function save department");
       return departmentRepository.save(department);
    }
}
