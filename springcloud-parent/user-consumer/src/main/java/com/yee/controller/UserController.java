package com.yee.controller;


import com.yee.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: UserController
 * Description:
 * date: 2021/12/14 14:52
 *
 * @author Yee
 * @since JDK 1.8
 */
//@RestController
//@DefaultProperties(defaultFallback="failBack") //在类上，指明统一的失败降级方法
//@RequestMapping("/consumer")
public class UserController {
//    x

    //服务降级处理方法
    //熔断方法的返回值和参数列表需和原方法一致,否则报错
    //类注解方法不需要参数
//    public User failBack(){
//        User user = new User();
//        user.setUsername("服务熔断");
//        return user;
//    }
}
