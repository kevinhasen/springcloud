package com.yee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: ConfigClientMain3377
 * Description:
 * date: 2021/12/16 11:11
 *
 * @author Yee
 * @since JDK 1.8
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientMain3377 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3377.class,args);
    }
}
