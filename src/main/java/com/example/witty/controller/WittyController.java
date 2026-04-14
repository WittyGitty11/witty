package com.example.witty.controller;

import com.example.witty.models.CreateOrderModel;
import com.example.witty.models.OrderModel;
import com.example.witty.service.OrderService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/dxl")
public class WittyController{
//    private static final Logger LOGGER = LoggerFactory.getLogger(WittyController.class);
    private OrderService service;

    @PostMapping(value = "/v1/order")
    public ResponseEntity<String> createorder(@RequestHeader Map<String, String> headers,
                                                  @RequestBody CreateOrderModel createOrderModel) {
            System.out.println("Controller layer " + createOrderModel);
            ResponseEntity<String> shoppingCartresponseEntity = service.createOrder(createOrderModel);
            return shoppingCartresponseEntity;

    }
}
