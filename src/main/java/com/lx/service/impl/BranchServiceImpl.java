package com.lx.service.impl;

import com.lx.mapper.BranchMapper;
import com.lx.pojo.Branch;
import com.lx.pojo.Stylist;
import com.lx.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchServiceImpl implements BranchService {

    @Autowired
    BranchMapper branchMapper;
    @Override
    public List<Branch> findAll() {
        return branchMapper.findAll();
    }

    @Override
    public Branch findById(int id) {
        return branchMapper.findById(id);
    }

    @Override
    public List<Stylist> findByBranchId(int id) {
        return branchMapper.findByBranchId(id);
    }

}
