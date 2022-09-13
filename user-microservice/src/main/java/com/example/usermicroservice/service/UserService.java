package com.example.usermicroservice.service;

import com.example.usermicroservice.ValueObjects.Department;
import com.example.usermicroservice.ValueObjects.ResponseTemplate;
import com.example.usermicroservice.entity.Users;
import com.example.usermicroservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    RestTemplate restTemplate;
    public Users saveUser(Users user) {
        log.info("Inside the service layer save user function");
        return userRepository.save(user);
    }

    public Users findUserById(Long id) {
        log.info("Inside the controller layer find user function");
        return userRepository.findById(id).get();
    }

    public ResponseTemplate findUserByIdWithDepartment(Long id) {
        Users user = userRepository.findById(id).get();
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/1",Department.class);

        ResponseTemplate responseTemplate = new ResponseTemplate();
        responseTemplate.setDepartment(department);
        responseTemplate.setUser(user);

        return responseTemplate;

    }
}
