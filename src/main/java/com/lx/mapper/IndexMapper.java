package com.lx.mapper;

import com.lx.pojo.Index;
import com.lx.pojo.Partner;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IndexMapper {
    List<Index> showInfo();

    List<Index> showSpeech();

    List<Index> showOrgImg();

    List<Partner> showPartner();
}
