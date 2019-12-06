package com.zhaoxiao.zxspringboot.service.impl;

import com.zhaoxiao.zxspringboot.bean.NovelTitle;
import com.zhaoxiao.zxspringboot.dao.NovelTitleDao;
import com.zhaoxiao.zxspringboot.service.NovelTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaoxiao
 */
@Service("novelTitleService")
public class NovelTitleServiceImpl implements NovelTitleService{
    @Autowired(required = false)
    NovelTitleDao novelTitleDao;
    @Override
    public List<NovelTitle> listNovelTitles() {
        List<NovelTitle> list=novelTitleDao.getAllNovel();
        return list;
    }
}
