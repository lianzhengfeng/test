package com.lzf.springcloud.controller;

import com.lzf.springcloud.entity.Dept;
import com.lzf.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return deptService.saveDept(dept);
    }
    @RequestMapping(value = "/dept/selectAll",method = RequestMethod.GET)
    public List<Dept> selectAll(){
        return deptService.queryAll();
    }
    @RequestMapping(value = "/dept/{deptNo}",method = RequestMethod.GET)
    public Dept selectByDeptNo(@PathVariable("deptNo") Long deptNo){
        return deptService.queryById(deptNo);
    }
}
