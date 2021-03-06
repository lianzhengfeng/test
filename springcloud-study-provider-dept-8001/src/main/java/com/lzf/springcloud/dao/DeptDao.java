package com.lzf.springcloud.dao;

import com.lzf.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    boolean addDept(Dept dept);
    Dept findById(Long deptNo);
    List<Dept> findAll();
}
