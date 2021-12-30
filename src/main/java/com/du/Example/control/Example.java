package com.du.Example.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Example {

    @GetMapping("/")
    public String fileControl(){
        return "index";
    }
}
