package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.User; //built by my self
import java.util.Optional;

public interface UserRepository extends JpaRepository {

    Optional<User> findByEmail(String email);

}
