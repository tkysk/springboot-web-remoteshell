package com.example.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by saeki on 2016/07/12.
 */
@Controller
public class homeController {

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "index";
    }

    @RequestMapping("/home")
    public String home(){
        return "home";
    }
}
