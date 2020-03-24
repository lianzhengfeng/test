package com.lzf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //启动服务后创建一个服务中心
public class SpringcloudStudyEuraka7001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudStudyEuraka7001Application.class, args);
    }
}
