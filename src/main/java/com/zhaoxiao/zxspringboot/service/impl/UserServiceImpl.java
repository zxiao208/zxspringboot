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

    //这个要加required =false，不加运行也不会错
    @Autowired(required = false)
    UserDao userDao;
    @Override
    public List<User> findAllUser() {
        List<User> users=userDao.getAllAdminUsers();
        return users;
    }
}
