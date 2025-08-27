package com.example.controller;

import com.example.dto.RecruiterDto;
import com.example.service.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/recruiters")
public class RecruiterController {

    @Autowired
    private RecruiterService recruiterService;

    @PostMapping("/register")
    public ResponseEntity <RecruiterDto> register(@RequestBody RecruiterDto dto){
        return ResponseEntity.ok(recruiterService.createRecruiter(dto));
    }

    @GetMapping("/{email}")
    public ResponseEntity<RecruiterDto>getByEmail(@PathVariable String email){
        return ResponseEntity.ok(recruiterService.getRecruiterByEmail(email));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecruiterDto>getById(@PathVariable Long id){
        return ResponseEntity.ok(recruiterService.getRecruiterById(id));
    }
}
