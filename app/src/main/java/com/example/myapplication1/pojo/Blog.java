package com.example.myapplication1.pojo;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 富文本素材
 * </p>
 *
 * @author zyl
 * @since 2020-06-22
 */
@Data
@Accessors(chain = true)
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * blogID
     */
    private String id;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getViewCounts() {
        return viewCounts;
    }

    public void setViewCounts(Integer viewCounts) {
        this.viewCounts = viewCounts;
    }

    public Integer getRecommendCount() {
        return recommendCount;
    }

    public void setRecommendCount(Integer recommendCount) {
        this.recommendCount = recommendCount;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * 标题
     */
    private String title;

    /**
     * 作者
     */
    private String author;

    /**
     * 素材标签
     */
    private String tag;

    /**
     * 播放量
     */
    private Integer viewCounts;

    /**
     * 推荐数
     */
    private Integer recommendCount;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

}
