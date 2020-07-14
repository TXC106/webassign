package com.qz.service;

import com.qz.pojo.Job;

import java.util.List;

public interface JobService {
    //增加用户
    int addJob(Job m);
    //删除用户
    int delJobById(int id);
    //修改用户信息
    int updateJob(Job m);
    //查找用户
    Job queryJob(Job job);
    //查询所有用户
    List<Job> queryAllJob();
}
