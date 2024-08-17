package com.appicenter.lectures.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String firstApi(){
        return "my first spring boot api";
    }

    @GetMapping("/second")
    public String secondApi(){
        return "my second spring boot api";
    }

}
