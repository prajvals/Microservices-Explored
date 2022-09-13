package com.example.usermicroservice.ValueObjects;

import com.example.usermicroservice.entity.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseTemplate {
    private Department department;
    private Users user;
}
