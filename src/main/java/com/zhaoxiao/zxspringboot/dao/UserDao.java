package com.zhaoxiao.zxspringboot.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhaoxiao
 */
@Mapper
public interface UserDao {
    /**
     *
     */
    void addUser();
    void updateUser();
    void deleteUser();
    void selectUser();
}
