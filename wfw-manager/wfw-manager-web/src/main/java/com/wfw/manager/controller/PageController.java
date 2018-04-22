package com.wfw.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by killer9527 on 2018/4/22.
 * 页面跳转
 */
@Controller
public class PageController {
    /**
     * 展示首页
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    /**
     * 展示页面
     * @param page
     * @return
     */
    @RequestMapping(value = "/{page}", method = RequestMethod.GET)
    public String showPage(@PathVariable(value = "page") String page){
        return page;
    }
}
