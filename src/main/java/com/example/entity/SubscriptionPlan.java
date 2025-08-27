package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name="sucription_plans")
public class SubscriptionPlan {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private String description;
    private Integer durationInDays;

    private String rozorpayorderId;
    private String rozorpayPaymentId;

    public SubscriptionPlan() {}

    public SubscriptionPlan(Long id, String name, Double price, String description, Integer durationInDays, String rozorpayorderId, String rozorpayPaymentId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.durationInDays = durationInDays;
        this.rozorpayorderId = rozorpayorderId;
        this.rozorpayPaymentId = rozorpayPaymentId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDurationInDays() {
        return durationInDays;
    }

    public void setDurationInDays(Integer durationInDays) {
        this.durationInDays = durationInDays;
    }

    public String getRozorpayorderId() {
        return rozorpayorderId;
    }

    public void setRozorpayorderId(String rozorpayorderId) {
        this.rozorpayorderId = rozorpayorderId;
    }

    public String getRozorpayPaymentId() {
        return rozorpayPaymentId;
    }

    public void setRozorpayPaymentId(String rozorpayPaymentId) {
        this.rozorpayPaymentId = rozorpayPaymentId;
    }
}
