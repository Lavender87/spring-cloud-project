package com.gupao.springcloudhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HystrixDemoController {

    private static Random random = new Random();

    @GetMapping("hello-world")
    @HystrixCommand(fallbackMethod = "errContent",
            commandProperties={
                @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds" ,value = "150")
            })
    public String helloWorld() throws Exception{
        int value = random.nextInt();
        System.out.println("helloWorld() costs " + value + " ms.");
        Thread.sleep(value);
        return "helloworld";
    }

    public String errContent(){
        return "fault";
    }
}
