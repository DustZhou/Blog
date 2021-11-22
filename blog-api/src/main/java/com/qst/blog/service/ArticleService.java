package com.qst.blog.service;

//import com.qst.blog.vo.ArticleVo;
import com.qst.blog.vo.Result;
import com.qst.blog.vo.params.PageParams;
import java.util.List;
public interface ArticleService {

    Result listArticle(PageParams pageParams);
    /**
     * 分页查询  文章列表
     * @param pageParams
     * @return
     */

}
