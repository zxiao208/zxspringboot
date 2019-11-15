package com.zhaoxiao.zxspringboot.dao;

import com.zhaoxiao.zxspringboot.bean.NovelTitle;
import com.zhaoxiao.zxspringboot.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zhaoxiao
 */
@Mapper
public interface NovelTitleDao {
    /**
     *
     */
    List<NovelTitle> getAllNovel();
}
