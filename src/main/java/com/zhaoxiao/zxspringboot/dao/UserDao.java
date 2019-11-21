package com.zhaoxiao.zxspringboot.dao;

import com.zhaoxiao.zxspringboot.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zhaoxiao
 */
@Mapper
public interface UserDao {
    /**
     *查找所有注册用户
     */
    List<User> getAllAdminUsers();

}
