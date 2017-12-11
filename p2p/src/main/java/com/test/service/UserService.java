package com.test.service;

import com.test.dao.UserDao;
import com.test.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public User login(User user) {

        return userDao.login(user);
    }

}
