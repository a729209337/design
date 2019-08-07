package com.lx.service.impl;

import com.github.pagehelper.Page;
import com.lx.mapper.NewsMapper;
import com.lx.pojo.News;
import com.lx.service.NewsSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NewsServiceImpl implements NewsSerice {
    @Autowired
    NewsMapper newsMapper;
    @Override
    public List<News> findAll() {
        List<News> newsList = newsMapper.findAll();
        return newsList;
    }

    @Override
    public List<News> findById(int id) {
        List<News> newsList = newsMapper.findById(id);
        return newsList;
    }
}
