package com.lk.blog.mapper;

import com.lk.blog.model.ArticleType;

public interface ArticleTypeMapper {
    int insert(ArticleType record);

    int insertSelective(ArticleType record);

    ArticleType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleType record);

    int updateByPrimaryKey(ArticleType record);
}