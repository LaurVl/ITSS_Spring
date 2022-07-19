package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    ReadPropertiesConfig configuration;

    @RequestMapping("/")
    String hello() {
        if(configuration.isEnabled()) {
            return "Hello World, my name is " + configuration.getName();
        } else {
            return "Hello World,my name is XXX and I live in YYY city";
        }
    }
}
