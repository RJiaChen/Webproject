package com.rjc.servlet.test;

import com.rjc.servlet.dao.UserDao;
import com.rjc.servlet.domain.User;
import org.junit.Test;

/**
 * @author: renjiachen
 * @date: 2020-10-25 15:22
 * @Description:
 */
public class UserDaoTest {
    @Test
    public void test() {
        User user = new User();
        user.setUsername("rjc");
        user.setPassword("123");

        UserDao userDao = new UserDao();
        User login = userDao.Login(user);
        System.out.println(login);
    }
}
