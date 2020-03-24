package com.lzf.springcloud.service;


import com.lzf.springcloud.entity.Dept;

import java.util.List;

public interface DeptService {
    boolean saveDept(Dept dept);
    List<Dept> queryAll();
    Dept queryById(Long deptNo);
}
