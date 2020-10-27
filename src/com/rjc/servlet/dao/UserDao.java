package com.rjc.servlet.dao;

import com.rjc.servlet.domain.User;
import com.rjc.servlet.utils.druidUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author: renjiachen
 * @date: 2020-10-25 15:16
 * @Description:
 */
public class UserDao {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(druidUtils.getDataSource());

    public User Login(User loginer) {
        try {
            String sql = "select * from user where username=? and password=?";
            User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class),
                    loginer.getUsername(), loginer.getPassword());

            return user;
        } catch (DataAccessException e) {
            return null;
        }
    }
}
