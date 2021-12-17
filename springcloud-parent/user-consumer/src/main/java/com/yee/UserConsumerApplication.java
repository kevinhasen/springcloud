package com.yee;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: UserConsumerApplication
 * Description:
 * date: 2021/12/14 14:50
 * 启动类
 * @author Yee
 * @since JDK 1.8
 */

@SpringCloudApplication //复合注解,包含三个注解
@EnableFeignClients
public class UserConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApplication.class,args);
    }

    //创建restTemplate实例
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
