package com.example.usermicroservice.ValueObjects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
    private Long Id;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
