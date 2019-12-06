package com.zhaoxiao.zxspringboot.service;

import com.zhaoxiao.zxspringboot.bean.NovelTitle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaoxiao
 */

public interface NovelTitleService {
     List<NovelTitle> listNovelTitles();
}
