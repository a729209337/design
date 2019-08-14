package com.lx.service;

import com.lx.pojo.Branch;
import com.lx.pojo.Stylist;

import java.util.List;

public interface BranchService {
    List<Branch> findAll();

    Branch findById(int id);

    List<Stylist> findByBranchId(int id);
}
