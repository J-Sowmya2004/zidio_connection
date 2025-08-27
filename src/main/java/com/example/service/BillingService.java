package com.example.service;

import com.example.entity.Invoice;
import org.springframework.beans.factory.annotation.Autowired;

public class BillingService {

    @Autowired
    private InvoiceRepository invoiceRepository;
    public Invoice createInvoice(InvoiceDTO dto){
        Invoice invoice=new Invoice();
        invoice.setId(dto.id);
        invoice.setUserEmail(dto.userEmail);
    }
}
