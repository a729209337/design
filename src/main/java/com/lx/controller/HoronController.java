package com.lx.controller;

import com.lx.pojo.Horon;
import com.lx.pojo.HoronName;
import com.lx.service.HoronService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class HoronController {

    @Autowired
    HoronService horonService;

    @RequestMapping("/findAll")
    public List<Horon> findAll(){
        List<Horon> horonList = horonService.findAll();

        return horonList;
    }

    @RequestMapping("findById")
    public List<Horon> findById(int id){
        List<Horon> byId = horonService.findById(id);
        return byId;
    }
    @RequestMapping("/findHoronAll")
    public List<HoronName> findHoronAll(){
        List<HoronName> horonNameList = horonService.findHoronAll();

        return horonNameList;
    }
}
