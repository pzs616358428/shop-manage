package com.pzs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA
 * User: pzs
 * Date: 2021/1/27
 * Time: 16:19
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/consoleView")
    public String consoleView() {
        return "home/console";
    }

}
