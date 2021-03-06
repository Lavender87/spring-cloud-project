package com.gupao.sleuth.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    private Logger logger = LoggerFactory.getLogger(DemoController.class);

    @GetMapping("")
    public String index(){
        String returnValue = "Hello,World";
        logger.info("{} index() : {}", getClass().getSimpleName(), returnValue);
        return returnValue;
    }

}
