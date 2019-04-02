package com.lk.blog.mapper;

import com.lk.blog.model.ArticleInfo;

public interface ArticleInfoMapper {
    int insert(ArticleInfo record);

    int insertSelective(ArticleInfo record);

    ArticleInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleInfo record);

    int updateByPrimaryKeyWithBLOBs(ArticleInfo record);

    int updateByPrimaryKey(ArticleInfo record);
}