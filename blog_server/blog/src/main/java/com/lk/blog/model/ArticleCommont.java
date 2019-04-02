package com.lk.blog.model;

import java.io.Serializable;
import java.util.Date;

public class ArticleCommont implements Serializable {
    private Integer id;

    private Integer articleId;

    private Integer commontorId;

    private Date commontTime;

    private Date updateTime;

    private String commontContent;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getCommontorId() {
        return commontorId;
    }

    public void setCommontorId(Integer commontorId) {
        this.commontorId = commontorId;
    }

    public Date getCommontTime() {
        return commontTime;
    }

    public void setCommontTime(Date commontTime) {
        this.commontTime = commontTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCommontContent() {
        return commontContent;
    }

    public void setCommontContent(String commontContent) {
        this.commontContent = commontContent == null ? null : commontContent.trim();
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
        ArticleCommont other = (ArticleCommont) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getArticleId() == null ? other.getArticleId() == null : this.getArticleId().equals(other.getArticleId()))
            && (this.getCommontorId() == null ? other.getCommontorId() == null : this.getCommontorId().equals(other.getCommontorId()))
            && (this.getCommontTime() == null ? other.getCommontTime() == null : this.getCommontTime().equals(other.getCommontTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCommontContent() == null ? other.getCommontContent() == null : this.getCommontContent().equals(other.getCommontContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getArticleId() == null) ? 0 : getArticleId().hashCode());
        result = prime * result + ((getCommontorId() == null) ? 0 : getCommontorId().hashCode());
        result = prime * result + ((getCommontTime() == null) ? 0 : getCommontTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCommontContent() == null) ? 0 : getCommontContent().hashCode());
        return result;
    }
}