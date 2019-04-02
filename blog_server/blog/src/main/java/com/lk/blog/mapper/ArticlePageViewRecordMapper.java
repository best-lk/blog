package com.lk.blog.mapper;

import com.lk.blog.model.ArticlePageViewRecord;

public interface ArticlePageViewRecordMapper {
    int insert(ArticlePageViewRecord record);

    int insertSelective(ArticlePageViewRecord record);

    ArticlePageViewRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticlePageViewRecord record);

    int updateByPrimaryKey(ArticlePageViewRecord record);
}