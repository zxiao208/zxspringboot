package com.zhaoxiao.zxspringboot.controller;

import com.zhaoxiao.zxspringboot.bean.User;
import com.zhaoxiao.zxspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaoxiao
 */
@RestController
@RequestMapping("users")
public class UserController {
        @Autowired
        private UserService userService;
        @RequestMapping("login")
        public @ResponseBody String Login(){  //@ResponseBody 自动转成json格式
                List<User> users = userService.findAllUser();
                return users.get(0).getUserName();
        }

}
