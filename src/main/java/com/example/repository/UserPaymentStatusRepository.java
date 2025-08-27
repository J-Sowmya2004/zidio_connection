package com.example.repository;

import com.example.dto.UserPaymentStatusDTO;
import com.example.entity.User;
import com.example.entity.UserPaymentStatus;

import java.util.Optional;

public interface UserPaymentStatusRepository {
    Optional<UserPaymentStatusDTO> findByUserId(Long id);

    UserPaymentStatus save(UserPaymentStatus paymentStatus);
}
