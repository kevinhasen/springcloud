package com.yee.fallback;

import com.yee.feign.UserClient;
import com.yee.pojo.User;
import org.springframework.stereotype.Component;

/**
 * ClassName: UserClientFallback
 * Description:
 * date: 2021/12/15 20:27
 *
 * @author Yee
 * @since JDK 1.8
 */
@Component
public class UserClientFallback implements UserClient {


    @Override
    public User finById(Integer id) {
        User user = new User();
        user.setUsername("服务熔断");
        return user;
    }
}
