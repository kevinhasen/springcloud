package com.yee.controller;

import com.yee.feign.UserClient;
import com.yee.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: ConsumerFeignController
 * Description:
 * date: 2021/12/15 20:03
 *
 * @author Yee
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/feign")
public class ConsumerFeignController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/{id}")
    public User queryById(@PathVariable(value = "id")Integer id){
        return userClient.finById(id);
    }
}
