package com.fedenkom.emc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("/hello")
    public String helloMsg(){
        return "Test method for HTTP GET request";
    }
}
