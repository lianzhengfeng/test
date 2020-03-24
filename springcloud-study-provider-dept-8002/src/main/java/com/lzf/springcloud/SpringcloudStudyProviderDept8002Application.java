package com.lzf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //本服务启动后会注册进eureka服务中
public class SpringcloudStudyProviderDept8002Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudStudyProviderDept8002Application.class, args);
    }

}
