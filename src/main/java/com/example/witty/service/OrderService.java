package com.example.witty.service;

import com.example.witty.models.CreateOrderModel;
import com.example.witty.models.OrderModel;
import com.example.witty.utility.ValidationUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class OrderService {
    public ResponseEntity<String> createOrder(CreateOrderModel createOrderModel) {
        ValidationUtil.validateReq(createOrderModel);
        return ResponseEntity.ok("HELLO WORLD");
    }
}
