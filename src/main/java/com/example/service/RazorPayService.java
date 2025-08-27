package com.example.service;

import jakarta.persistence.criteria.Order;
import lombok.Value;
import org.cloudinary.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class RazorPayService {

    @Value("${razorpay.key}")
    private String key;

    @Value("${razorpay.secret}")
    private String secret;

    public static <RazorpayClient> String createOrder(Double amount, String currency, String receipt){
        try{
            RazorpayClient client=new RazorpayClient(key,secret);
            JSONObject orderRequest=new JSONObject();
            orderRequest.put("amount",(int)(amount*100));
            orderRequest.put("currency",currency);
            orderRequest.put("receipt",receipt);

            Order order=client.orders.create(orderRequest);
            return order.toString();
        }catch(Exception e){
            throw new RuntimeException("Error creating RozorPay order");
        }
    }
}
