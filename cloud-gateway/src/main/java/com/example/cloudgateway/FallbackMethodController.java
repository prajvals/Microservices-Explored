package com.example.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallBackMethod()
    {
        return "The User Service is taking longer than expected Please Try Again";
    }

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallBackMethod()
    {
        return "The Department Service is taking longer than expected Please Try Again";
    }
}
