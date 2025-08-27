package com.example.dto;

import com.example.Enum.Role;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    public String name;
    public String email;
    public String password;
    public Role role;
}
