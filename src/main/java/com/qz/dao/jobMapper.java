package com.qz.dao;

import com.qz.pojo.Job;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface jobMapper {
    //增加职位
    int addJob(Job m);
    //删除职位
    int delJobById(@Param("uid") int id);
    //修改职位
    int updateJob(Job m);
    //查找职位
    Job queryJob(Job user);
    //查询所有职位
    List<Job> queryAllJob();
}
