package com.zhaoxiao.zxspringboot.bean;

/**
 * @author zhaoxiao
 */
public class NovelTitle
{


    /**
     * id : 1
     * title : 倚天屠龙记
     * desc : 经典武侠小说
     * author : 金庸
     * noveltype_id : 2
     * tags : 武侠 冒险
     * collection_num : 99999
     * score : 100
     * down_url : http:www.zhaoxiao.com/novel/txt
     * img_url : http://www.zhaoxiao.com/novel/imag
     */

    private int id;
    private String title;
    private String desc;
    private String author;
    private int noveltypeId;
    private String tags;
    private int collectionNum;
    private int score;
    private String downUrl;
    private String imgUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNoveltypeId() {
        return noveltypeId;
    }

    public void setNoveltypeId(int noveltypeId) {
        this.noveltypeId = noveltypeId;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getCollectionNum() {
        return collectionNum;
    }

    public void setCollectionNum(int collectionNum) {
        this.collectionNum = collectionNum;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDownUrl() {
        return downUrl;
    }

    public void setDownUrl(String downUrl) {
        this.downUrl = downUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
