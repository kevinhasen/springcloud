package com.yee.dao;

import com.yee.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ClassName: UserDao
 * Description:
 * date: 2021/12/14 13:48
 *
 * @author Yee
 * @since JDK 1.8
 */
public interface UserDao extends JpaRepository<User,Integer> {
}
