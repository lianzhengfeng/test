package com.lzf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudStudyEuraka7002Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudStudyEuraka7002Application.class, args);
    }

}
