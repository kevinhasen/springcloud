package com.yee.service;


import com.yee.pojo.User;

/**
 * ClassName: UserService
 * Description:
 * date: 2021/12/14 13:49
 *
 * @author Yee
 * @since JDK 1.8
 */

public interface UserService {
    //根据ID查询用户信息
    User findByUserId(Integer id);
}
