package com.lzf.springcloud.service.impl;

import com.lzf.springcloud.dao.DeptDao;
import com.lzf.springcloud.entity.Dept;
import com.lzf.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Override
    public boolean saveDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.findAll();
    }

    @Override
    public Dept queryById(Long deptNo) {
        return deptDao.findById(deptNo);
    }
}
