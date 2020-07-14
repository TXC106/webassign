package com.qz.service;

import com.qz.dao.jobMapper;
import com.qz.pojo.Job;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImp implements JobService{
    //service调dao层
    private jobMapper jobmapper;

    public void setJobmapper(jobMapper jobmapper) {
        this.jobmapper = jobmapper;
    }

    public int addJob(Job m) {
        return jobmapper.addJob(m);
    }

    public int delJobById(int id) {
        return jobmapper.delJobById(id);
    }

    public int updateJob(Job m) {
        return jobmapper.updateJob(m);
    }

    public Job queryJob(Job job) {
        return jobmapper.queryJob(job);
    }

    public List<Job> queryAllJob() {
        return jobmapper.queryAllJob();
    }

}
