package com.lx.mapper;

import com.github.pagehelper.Page;
import com.lx.pojo.News;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface NewsMapper {
//    List<News> findAll();
    Page<News> findAll();
    List<News> findById(int id);
}
