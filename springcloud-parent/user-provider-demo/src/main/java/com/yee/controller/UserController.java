package com.yee.controller;

import com.yee.pojo.User;
import com.yee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: UserController
 * Description:
 * date: 2021/12/14 13:51
 *
 * @author Yee
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //根据ID查询用户信息
    @GetMapping("/{id}")
    public User finById(@PathVariable("id") Integer id){
        User user = userService.findByUserId(id);
        user.setUsername("user-provider-demo");
        return user;
    }
}
