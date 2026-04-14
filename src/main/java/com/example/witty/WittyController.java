package com.example.witty;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@AllArgsConstructor
public class WittyController{
    private OrderService service;

    @PostMapping(value = "dxl/v1/order")
    public ResponseEntity<String> createorder(@RequestHeader Map<String, String> headers,
                                                  @RequestBody CreateOrderModel createOrderModel) {
            System.out.println("Controller layer " + createOrderModel);
            ResponseEntity<String> shoppingCartresponseEntity = service.createOrder(createOrderModel);
            return shoppingCartresponseEntity;
    }
}
