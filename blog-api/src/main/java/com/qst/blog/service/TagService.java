package com.qst.blog.service;

import com.qst.blog.vo.TagVo;

import java.util.List;

public interface TagService {
    List<TagVo> findTagsByArticleId(Long articleId);
}
