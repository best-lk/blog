package com.lk.blog.model;

import java.io.Serializable;
import java.util.Date;

public class ArticleType implements Serializable {
    private Integer id;

    private String articleTypeName;

    private String articleTypeDescripiton;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticleTypeName() {
        return articleTypeName;
    }

    public void setArticleTypeName(String articleTypeName) {
        this.articleTypeName = articleTypeName == null ? null : articleTypeName.trim();
    }

    public String getArticleTypeDescripiton() {
        return articleTypeDescripiton;
    }

    public void setArticleTypeDescripiton(String articleTypeDescripiton) {
        this.articleTypeDescripiton = articleTypeDescripiton == null ? null : articleTypeDescripiton.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        ArticleType other = (ArticleType) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getArticleTypeName() == null ? other.getArticleTypeName() == null : this.getArticleTypeName().equals(other.getArticleTypeName()))
            && (this.getArticleTypeDescripiton() == null ? other.getArticleTypeDescripiton() == null : this.getArticleTypeDescripiton().equals(other.getArticleTypeDescripiton()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getArticleTypeName() == null) ? 0 : getArticleTypeName().hashCode());
        result = prime * result + ((getArticleTypeDescripiton() == null) ? 0 : getArticleTypeDescripiton().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}