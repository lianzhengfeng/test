package com.lzf.springcloud.controller;
import com.lzf.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
public class DeptController_Consummer {
    private static  final String REST_URL_PREFIX="http://STUDY-SPRINGCLOUD-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consummer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }
    @RequestMapping(value = "/consummer/dept/{deptNo}")
    public Dept selectById(@PathVariable("deptNo") Long deptNo){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/"+deptNo,Dept.class);
    }
    @RequestMapping(value = "/consummer/dept/selectAll")
    public List<Dept> selectAll(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/selectAll",List.class);
    }
}
