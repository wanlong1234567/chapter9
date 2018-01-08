package com.jd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 主页
 * @author wanlong
 * @since 2018/1/4
 */


@Controller
public class IndexController {

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
