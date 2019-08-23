package com.zhaoxiao.zxspringboot.controller;

import com.zhaoxiao.zxspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoxiao
 */
@RestController
@RequestMapping("users")
public class UserController {
        @Autowired
        private UserService userService;
        @RequestMapping("login")
        public @ResponseBody String Login(){
                userService.findAllUser();
                return "niha";
        }

}
