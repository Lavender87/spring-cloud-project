package com.gupao.springcloudhystrix;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class SpringCloudHystrixDemo {

    public static void main(String[] args) {

        new SpringApplication().run(SpringCloudHystrixDemo.class,args);

    }
}
