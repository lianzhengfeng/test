package com.lzf.springcloud;

import com.lzf.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="STUDY-SPRINGCLOUD-DEPT",configuration = MySelfRule.class)
public class SpringcloudStudyConsumerDept80Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudStudyConsumerDept80Application.class, args);
    }

}
