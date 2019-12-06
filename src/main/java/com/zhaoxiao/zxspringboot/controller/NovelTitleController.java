package com.zhaoxiao.zxspringboot.controller;

import com.zhaoxiao.zxspringboot.bean.NovelTitle;
import com.zhaoxiao.zxspringboot.bean.User;
import com.zhaoxiao.zxspringboot.service.NovelTitleService;
import com.zhaoxiao.zxspringboot.service.UserService;
import com.zhaoxiao.zxspringboot.utils.JedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhaoxiao
 */

@RestController
@RequestMapping("/noveltitle")
public class NovelTitleController {
    @Autowired
    private NovelTitleService novelTitleService;
    @Autowired
    private JedisUtils jedisUtils;
    @RequestMapping("/getall")
    public @ResponseBody List<NovelTitle> Login(){  //@ResponseBody 自动转成json格式
            List<NovelTitle> noveltitles = novelTitleService.listNovelTitles();
            return noveltitles;
    }

}
