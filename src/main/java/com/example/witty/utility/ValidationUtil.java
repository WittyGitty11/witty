package com.example.witty.utility;

import com.example.witty.models.CreateOrderModel;

public class ValidationUtil {

    public static void validateReq(CreateOrderModel model){
        System.out.println("VALIDATION Layer");
        if(model.getMsisdn()==null){
            throw new RuntimeException("MSISDN SHOULD NOT BE EMPTY");
        }
    }
}
