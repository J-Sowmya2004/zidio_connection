package com.example.controller;

import com.example.service.RazorPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.SignatureException;

@RestController
@RequestMapping("/api/rozorpays")
public class RazorPayController {

    @Autowired
    private RazorPayService razorPayService;

    @PostMapping("payment/wehook")
    public ResponseEntity<String> handleWebhook(@RequestBody String payLoad, @RequestHeader("X-Rozorpay-Signature") String Signature) {
        String secret = "YOUR_WEBHOOK_SECRET";
        try {
            RazorpayClient.verifyWebhookSignature(payload, signature, secret);
        } catch (SignatureException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid signature");
        }
        return ResponseEntity.ok("Webhook received");

    }

    @PostMapping("create-order")
    public ResponseEntity<String> createOrder(@RequestParam double amount, @RequestParam String currency, @RequestParam String receipt) {
        try {
            String orderJson = RazorPayService.createOrder(amount, currency, receipt);
            return ResponseEntity.ok(orderJson);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to createorder");
        }
    }
}