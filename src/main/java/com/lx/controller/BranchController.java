package com.lx.controller;

import com.lx.pojo.Branch;
import com.lx.pojo.Stylist;
import com.lx.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BranchController {
    @Autowired
    BranchService branchService;

    @RequestMapping("/findAll")
    public List<Branch> findAll(){
        List<Branch> branchList =  branchService.findAll();
        return branchList;
    }

    @RequestMapping("/findById")
    public Branch findById(int id){
        return branchService.findById(id);
    }

    @RequestMapping("findByBranchId")
    public List<Stylist> findByBranchId(int id){
        return branchService.findByBranchId(id);
    }
}
