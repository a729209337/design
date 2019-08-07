package com.lx.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lx.pojo.News;
import com.lx.service.NewsSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {
    @Autowired
    NewsSerice newsSerice;

    @RequestMapping("/findNewsAll")
    public List<News> findNewsAll(){
//        PageHelper.startPage(pageNo,pageSize);
        List<News> newsList = newsSerice.findAll();
        return newsList;
//        PageInfo<News> pageInfo = new PageInfo<>(newsSerice.findAll());
//        return pageInfo;
    }
    @RequestMapping("/findNewId")
    public List<News> findNewId(int id){
        List<News> byId = newsSerice.findById(id);
        return byId;
    }
}
