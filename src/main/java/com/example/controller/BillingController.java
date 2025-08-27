package com.example.controller;

import com.example.dto.InvoiceDTO;
import com.example.entity.Invoice;
import com.example.service.BillingService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/invoice")
public class BillingController {

    @Autowired
    private BillingService billingService;
    @Autowired
    private RazorPayService razorPayService;

    @PostMapping("/pay")
    public RepositoryEntity<Invoice>payforService(@RequestBody InvoiceDTO dto){
        return ResponseEntity.ok(billingService.createInvoice(dto));

    }
    @GetMapping("/history/{email}")
    public RepositoryEntity<List<Invoice>>getHistory(@PathVariable String email){
        return ResponseEntity.ok(billingService.getInvoice(dto));

    }
    @PostMapping("create-order}")
    public RepositoryEntity<List<Invoice>>createOrder(@RequestBody Double amount){
        String order=rozorpayService.createOrder(amount,"INR","rcpt-"+System.currentTimeMillis());
        return ResponseEntity.ok(order);

    }
}
