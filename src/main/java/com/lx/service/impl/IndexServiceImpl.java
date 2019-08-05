package com.lx.service.impl;

import com.lx.mapper.IndexMapper;
import com.lx.service.IndexSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexSerice {

    @Autowired
    IndexMapper indexMapper;

    @Override
    public String showInfo() {
        return indexMapper.showInfo();
    }

    @Override
    public String showSpeech() {
        return indexMapper.showSpeech();
    }

    @Override
    public String showOrgImg() {
        return indexMapper.showOrgImg();
    }

    @Override
    public String showPartner() {
        return indexMapper.showPartner();
    }
}
