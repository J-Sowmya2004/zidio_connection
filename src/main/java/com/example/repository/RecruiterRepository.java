package com.example.repository;

import java.util.Optional;
import com.example.entity.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruiterRepository extends JpaRepository<Recruiter, Long> {
    Recruiter findByEmail(String email);
    Optional<Recruiter> findById(Long id);
}
