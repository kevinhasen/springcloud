package com.yee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: GatewayApplication
 * Description:
 * date: 2021/12/16 9:34
 *  对尤里卡来说,网关也是一个微服务,也有注册
 * @author Yee
 * @since JDK 1.8
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class,args);
    }
}
