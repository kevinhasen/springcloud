package com.yee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: NacosMain83
 * Description:
 * date: 2021/12/16 10:56
 *
 * @author Yee
 * @since JDK 1.8
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosMain83 {
    public static void main(String[] args) {
        SpringApplication.run(NacosMain83.class,args);
    }
}
