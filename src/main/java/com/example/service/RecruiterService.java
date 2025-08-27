package com.example.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.RecruiterDto;
import com.example.entity.Recruiter;
import com.example.repository.RecruiterRepository;

@Service
public class RecruiterService {

    @Autowired
    private RecruiterRepository recruiterRepository;


    public RecruiterDto createRecruiter(RecruiterDto dto) {
        Recruiter recruiter = new Recruiter(dto.id,dto.name,dto.email,dto.phone,dto.companyName,dto.companyDescription,dto.companyWebsite);
        recruiter=recruiterRepository.save(recruiter);
        return new RecruiterDto(
                recruiter.getId(),
                recruiter.getName(),
                recruiter.getEmail(),
                recruiter.getPhone(),
                recruiter.getCompanyName(),
                recruiter.getCompanydescription(),
                recruiter.getCompanyWebsite());
    }

    public RecruiterDto getRecruiterByEmail(String email) {
        Recruiter recruiter = recruiterRepository.findByEmail(email);
        if(recruiter == null)return null;
        return new RecruiterDto(
                recruiter.getId(),
                recruiter.getName(),
                recruiter.getEmail(),
                recruiter.getPhone(),
                recruiter.getCompanyName(),
                recruiter.getCompanydescription(),
                recruiter.getCompanyWebsite());
    }

    public RecruiterDto getRecruiterById(Long id) {
        Optional<Recruiter> optionalRecruiter = recruiterRepository.findById(id);
        if(!optionalRecruiter.isPresent())return null;
        Recruiter recruiter =new Recruiter();
        return new RecruiterDto(recruiter.getId(),
                recruiter.getName(),
                recruiter.getEmail(),
                recruiter.getPhone(),
                recruiter.getCompanyName(),
                recruiter.getCompanydescription(),
                recruiter.getCompanyWebsite());

    }
}

