package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Dept;

import java.util.List;

/**
 * @author zhangchengwei
 * @create 2022-09-11 17:56
 */
public interface DeptDao {

    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}
