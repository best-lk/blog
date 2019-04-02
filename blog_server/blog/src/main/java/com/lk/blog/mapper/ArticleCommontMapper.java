package com.lk.blog.mapper;

import com.lk.blog.model.ArticleCommont;

public interface ArticleCommontMapper {
    int insert(ArticleCommont record);

    int insertSelective(ArticleCommont record);

    ArticleCommont selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleCommont record);

    int updateByPrimaryKeyWithBLOBs(ArticleCommont record);

    int updateByPrimaryKey(ArticleCommont record);
}