package com.lx.controller;

import com.lx.service.IndexSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    IndexSerice indexSerice;

    /**
     * 展示设计总院简介
     * @return
     */
    @RequestMapping("/showInfo")
    public String showInfo() {
        return indexSerice.showInfo();
    }

    /**
     * 展示院长致辞
     * @return
     */
    @RequestMapping("/showSpeech")
    public String showSpeech() {
        return indexSerice.showSpeech();
    }

    /**
     * 展示组织架构图片
     * @return
     */
    @RequestMapping("/showOrgImg")
    public String showOrgImg() {
        return indexSerice.showOrgImg();
    }

    /**
     * 展示合作伙伴
     * @return
     */
    @RequestMapping("/showPartner")
    public String showPartner() {
        return indexSerice.showPartner();
    }

}
