package com.gupao.user;

import com.gupao.user.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * {@link UserService 用户服务} 引导类
 *
 * @since 2017/10/28
 */
@SpringBootApplication
@EnableDiscoveryClient
//@SpringCloudApplication
public class UserServiceProviderBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceProviderBootstrap.class, args);
    }
}
