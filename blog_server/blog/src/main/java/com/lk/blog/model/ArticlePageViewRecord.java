package com.lk.blog.model;

import java.io.Serializable;
import java.util.Date;

public class ArticlePageViewRecord implements Serializable {
    private Integer id;

    private Date pageViewTime;

    private Integer articleId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getPageViewTime() {
        return pageViewTime;
    }

    public void setPageViewTime(Date pageViewTime) {
        this.pageViewTime = pageViewTime;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ArticlePageViewRecord other = (ArticlePageViewRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPageViewTime() == null ? other.getPageViewTime() == null : this.getPageViewTime().equals(other.getPageViewTime()))
            && (this.getArticleId() == null ? other.getArticleId() == null : this.getArticleId().equals(other.getArticleId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPageViewTime() == null) ? 0 : getPageViewTime().hashCode());
        result = prime * result + ((getArticleId() == null) ? 0 : getArticleId().hashCode());
        return result;
    }
}