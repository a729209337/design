package com.lx.controller;

import com.lx.pojo.Horon;
import com.lx.service.HoronService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HoronController {
    @Autowired
    HoronService horonService;
    @RequestMapping("/findAll")
    public List<Horon> findAll(Horon horon){
        List<Horon> horonList = horonService.findAll(horon);

        return horonList;
    }
    @RequestMapping("findById")
    public Horon findById(int id){
        Horon horon = horonService.findById(id);
        return horon;
    }

}
