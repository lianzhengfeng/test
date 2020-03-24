package com.lzf.springcloud.entity;

import java.io.Serializable;

public class Dept implements Serializable {
    private Long deptNo;
    private String dname;
    private String dbSource;

    public Dept(){}
    public Dept(Long deptNo, String dname, String dbSource) {
        this.deptNo = deptNo;
        this.dname = dname;
        this.dbSource = dbSource;
    }

    public Long getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Long deptNo) {
        this.deptNo = deptNo;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptNo=" + deptNo +
                ", dname='" + dname + '\'' +
                ", dbSource='" + dbSource + '\'' +
                '}';
    }
}
