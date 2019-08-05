package com.lx.mapper;

import com.lx.pojo.Horon;
import com.lx.pojo.HoronName;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface HoronMapper {
    List<Horon> findAll();

    List<Horon> findById(int id);

    List<HoronName> findHoronNameAll();

}
