package com.lx.service;

import com.github.pagehelper.Page;
import com.lx.pojo.News;

import java.util.List;

public interface NewsSerice {
    List<News> findAll();
    List<News> findById(int id);
}
