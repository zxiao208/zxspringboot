package com.zhaoxiao.zxspringboot.bean;

/**
 * @author zhaoxiao
 */
public class NovelChapter {
    /**
     * id : 1
     * chapter_id : 00000000001
     * novel_name : 群雄争夺屠龙刀
     * novel_id : 1
     * content_id : 1
     * is_delete : 0
     * words : 3000
     * ctime : 12/11/2019 13:44:51
     * utime : 12/11/2019 13:45:05
     */

    private int id;
    private int chapter_id;
    private String novel_name;
    private int novel_id;
    private int content_id;
    private int is_delete;
    private int words;
    private String ctime;
    private String utime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChapter_id() {
        return chapter_id;
    }

    public void setChapter_id(int chapter_id) {
        this.chapter_id = chapter_id;
    }

    public String getNovel_name() {
        return novel_name;
    }

    public void setNovel_name(String novel_name) {
        this.novel_name = novel_name;
    }

    public int getNovel_id() {
        return novel_id;
    }

    public void setNovel_id(int novel_id) {
        this.novel_id = novel_id;
    }

    public int getContent_id() {
        return content_id;
    }

    public void setContent_id(int content_id) {
        this.content_id = content_id;
    }

    public int getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(int is_delete) {
        this.is_delete = is_delete;
    }

    public int getWords() {
        return words;
    }

    public void setWords(int words) {
        this.words = words;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getUtime() {
        return utime;
    }

    public void setUtime(String utime) {
        this.utime = utime;
    }
}
