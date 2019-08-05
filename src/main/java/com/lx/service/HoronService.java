package com.lx.service;

import com.lx.pojo.Horon;
import com.lx.pojo.HoronName;

import java.util.List;

public interface HoronService {

    List<Horon> findAll();

    List<Horon> findById (int id);

    List<HoronName> findHoronAll();

}
