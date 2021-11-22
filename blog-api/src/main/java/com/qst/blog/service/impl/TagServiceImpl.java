package com.qst.blog.service.impl;

import com.qst.blog.dao.mapper.TagMapper;
import com.qst.blog.dao.pojo.Tag;
import com.qst.blog.service.TagService;
import com.qst.blog.vo.TagVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private TagMapper tagMapper;

    public TagVo copy(Tag tag){
        TagVo tagVo = new TagVo();
        BeanUtils.copyProperties(tag,tagVo);
        return tagVo;
    }
    public List<TagVo> copyList(List<Tag> tagList){
        List<TagVo> tagVoList = new ArrayList<>();
        for (Tag tag : tagList) {
            tagVoList.add(copy(tag));
        }
        return tagVoList;
    }


    @Override
    public List<TagVo> findTagsByArticleId(Long articleId){
        //mybatisplus 无法进行多表查询。
        List<Tag> tags = tagMapper.findTagsByArticleId(articleId);
        return copyList(tags);
    }
}
