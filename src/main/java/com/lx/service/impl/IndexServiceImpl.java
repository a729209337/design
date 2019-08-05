package com.lx.service.impl;

import com.lx.mapper.IndexMapper;
import com.lx.pojo.Index;
import com.lx.pojo.Partner;
import com.lx.service.IndexSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl implements IndexSerice {

    @Autowired
    IndexMapper indexMapper;

    @Override
    public List<Index> showInfo() {
        List<Index> indexList =indexMapper.showInfo();
        System.out.println(indexList);
        return indexList;
    }

    @Override
    public List<Index> showSpeech() {
        return indexMapper.showSpeech();
    }

    @Override
    public List<Index> showOrgImg() {
        return indexMapper.showOrgImg();
    }

    @Override
    public List<Partner> showPartner() {
        return indexMapper.showPartner();
    }
}
