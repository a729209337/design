package com.lx.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IndexMapper {
    String showInfo();

    String showSpeech();

    String showOrgImg();

    String showPartner();
}
