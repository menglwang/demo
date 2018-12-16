package com.xunwu.frist.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther 王梦龙
 * @date 2018/12/16 18:07
 */
@Controller
public class PageController {
    @RequestMapping("housepager")
    public String housePage(){
        System.out.println("aaaaaaaaa");
        return "/views/modules/generator/house";
    }
}
