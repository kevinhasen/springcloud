package com.yee.service.impl;

import com.yee.dao.UserDao;
import com.yee.pojo.User;
import com.yee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * Description:
 * date: 2021/12/14 13:50
 *
 * @author Yee
 * @since JDK 1.8
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    //根据ID查询用户信息
    @Override
    public User findByUserId(Integer id) {
        return userDao.findById(id).get();
    }
}
