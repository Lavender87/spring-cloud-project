package com.gupao.zinpkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerSpringApplication.class,args);
    }
}
