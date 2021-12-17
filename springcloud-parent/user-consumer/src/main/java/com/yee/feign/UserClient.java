package com.yee.feign;

import com.yee.fallback.UserClientFallback;
import com.yee.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ClassName: UserClient
 * Description:
 * date: 2021/12/15 19:58
 *
 * @author Yee
 * @since JDK 1.8
 */
//提供者名称
@FeignClient(value = "user-provider",fallback = UserClientFallback.class)
public interface UserClient {
    //根据ID查询用户信息
    @GetMapping("/user/{id}")
    public User finById(@PathVariable("id") Integer id);
}
