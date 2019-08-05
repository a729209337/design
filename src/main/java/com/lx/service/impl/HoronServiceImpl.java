package com.lx.service.impl;

import com.lx.mapper.HoronMapper;
import com.lx.pojo.Horon;
import com.lx.pojo.HoronName;
import com.lx.service.HoronService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HoronServiceImpl implements HoronService {

    @Autowired
    HoronMapper horonMapper;

    @Override
    public List<Horon> findAll() {

        return horonMapper.findAll();
    }

    @Override
    public List<Horon> findById(int id) {
        return horonMapper.findById(id);
    }

    @Override
    public List<HoronName> findHoronAll() {
        List<HoronName> horonNameList = horonMapper.findHoronNameAll();
        return horonNameList;
    }
}
