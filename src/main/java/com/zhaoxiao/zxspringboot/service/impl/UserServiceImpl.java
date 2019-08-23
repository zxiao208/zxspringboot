package com.zhaoxiao.zxspringboot.service.impl;

import com.zhaoxiao.zxspringboot.bean.User;
import com.zhaoxiao.zxspringboot.dao.UserDao;
import com.zhaoxiao.zxspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaoxiao
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;
    @Override
    public List<User> findAllUser() {
        userDao.addUser();
        return null;
    }
}
