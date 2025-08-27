package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.entity.SubscriptionPlan;

public interface SubscriptionPlanRepository extends JpaRepository<SubscriptionPlan, Long> {
    // You don't need to declare findAll() — it's inherited from JpaRepository
}
