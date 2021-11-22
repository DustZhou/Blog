package com.qst.blog.controller;

import com.qst.blog.service.ArticleService;
import com.qst.blog.vo.ArticleVo;
import com.qst.blog.vo.Result;
import com.qst.blog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("articles")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    //Result是统一结果返回
    /**
     * 首页文章列表
     * @param pageParams
     * @return
     */
    @PostMapping
    public Result listArticle(@RequestBody PageParams pageParams){
        System.out.println("---------------------------------------------------------------");
        return articleService.listArticle(pageParams);
//        return Result.success(articles);

    }
}
