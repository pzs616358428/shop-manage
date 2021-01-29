package com.pzs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA
 * User: pzs
 * Date: 2021/1/28
 * Time: 10:16
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

}
