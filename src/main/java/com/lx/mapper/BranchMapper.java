package com.lx.mapper;

import com.lx.pojo.Branch;
import com.lx.pojo.Stylist;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BranchMapper {
    List<Branch> findAll();

    Branch findById(int id);


    List<Stylist> findByBranchId(int id);
}
