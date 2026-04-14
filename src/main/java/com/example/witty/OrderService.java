package com.example.witty;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class OrderService {
    public ResponseEntity<String> createOrder(CreateOrderModel createOrderModel) {
        System.out.println("VALIDATION Layer");
        if(createOrderModel.getMsisdn()==null){
            throw new RuntimeException("MSISDN SHOULD NOT BE EMPTY");
        }
        return ResponseEntity.ok("HELLO WORLD");
    }
}
