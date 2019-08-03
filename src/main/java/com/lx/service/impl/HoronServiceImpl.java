package com.lx.service.impl;

import com.lx.mapper.HoronMapper;
import com.lx.pojo.Horon;
import com.lx.service.HoronService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HoronServiceImpl implements HoronService {
    @Autowired
    HoronMapper horonMapper;
    @Override
    public List<Horon> findAll(Horon horon) {
        List<Horon> horonList = horonMapper.findAll(horon);
        return horonList;
    }

    @Override
    public Horon findById(int id) {
        return horonMapper.findById(id);
    }
}
