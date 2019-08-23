package com.zhaoxiao.zxspringboot.service;

import com.zhaoxiao.zxspringboot.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaoxiao
 */
public interface UserService {
    List<User> findAllUser();
}
