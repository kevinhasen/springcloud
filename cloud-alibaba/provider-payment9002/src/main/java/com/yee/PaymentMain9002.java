package com.yee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: PaymentApplication
 * Description:
 * date: 2021/12/16 10:35
 *
 * @author Yee
 * @since JDK 1.8
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9002.class,args);
    }
}
