package com.lx.service;

import com.lx.pojo.Horon;

import java.util.List;

public interface HoronService {
    List<Horon> findAll(Horon horon);

    Horon findById (int id);

}
