package com.yee.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: PaymentController
 * Description:
 * date: 2021/12/16 10:37
 *
 * @author Yee
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/{id}")
    public String getPayment(@PathVariable("id") Integer id){
        return "serverPort: "+ serverPort+" id"+id;
    }
}
