package com.lx.controller;

import com.lx.pojo.Index;
import com.lx.pojo.Partner;
import com.lx.service.IndexSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    IndexSerice indexSerice;

    /**
     * 展示设计总院简介
     * @return
     */
    @RequestMapping("/showInfo")
    public List<Index> showInfo() {
        List<Index> indexList = indexSerice.showInfo();
        System.out.println(indexList);
        return indexList;
    }

    /**
     * 展示院长致辞
     * @return
     */
    @RequestMapping("/showSpeech")
    public List<Index> showSpeech() {
        return indexSerice.showSpeech();
    }

    /**
     * 展示组织架构图片
     * @return
     */
    @RequestMapping("/showOrgImg")
    public List<Index> showOrgImg() {
        return indexSerice.showOrgImg();
    }

    /**
     * 展示合作伙伴
     * @return
     */
    @RequestMapping("/showPartner")
    public List<Partner> showPartner() {
        return indexSerice.showPartner();
    }

}
