package com.example.dto;

import com.example.Enum.PaymentStatus;
import com.example.Enum.PaymentType;
import com.example.Enum.ServiceType;

import java.time.LocalDateTime;

public class InvoiceDTO {
    public Long id;
    public String userEmail;
    public ServiceType serviceType;
    public Double amount;
    public LocalDateTime purchaseDate=LocalDateTime.now();
    public PaymentType paymentMethod;
    public PaymentStatus status;
    public String invoiceNumber;
    public String invoiceDownloadURL;
    public String subscriptionPlan;

    public InvoiceDTO(Long id, String userEmail, ServiceType serviceType, Double amount, LocalDateTime purchaseDate, PaymentType paymentMethod, PaymentStatus status, String invoiceNumber, String invoiceDownloadURL, String subscriptionPlan) {
        this.id = id;
        this.userEmail = userEmail;
        this.serviceType = serviceType;
        this.amount = amount;
        this.purchaseDate = purchaseDate;
        this.paymentMethod = paymentMethod;
        this.status = status;
        this.invoiceNumber = invoiceNumber;
        this.invoiceDownloadURL = invoiceDownloadURL;
        this.subscriptionPlan = subscriptionPlan;
    }
}
