package com.ithima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName secondController
 * @Description TODO
 * @Author tree
 * @Date 2019/5/19 19:54
 * @Version 1.8
 **/

@Controller
@RequestMapping(value = "/hello")
public class SecondController {
    @RequestMapping(value = "/second")
    public String handleRequest(Model model){
        model.addAttribute("h","SSM合并测试");
        return "second";
    }
}
