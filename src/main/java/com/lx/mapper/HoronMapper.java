package com.lx.mapper;

import com.lx.pojo.Horon;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface HoronMapper {
    List<Horon> findAll(Horon horon);

    Horon findById (int id);


}
