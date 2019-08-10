package com.lx.service;

import com.lx.pojo.FirstPage;
import com.lx.pojo.Index;
import com.lx.pojo.Partner;

import java.util.List;

public interface IndexSerice {

    List<Index> showInfo();

    List<Index> showSpeech();

    List<Index> showOrgImg();

    List<Partner> showPartner();

    List<FirstPage> showAll();
}
