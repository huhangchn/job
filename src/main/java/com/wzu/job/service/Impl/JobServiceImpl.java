package com.wzu.job.service.Impl;

import com.wzu.job.bean.Job;
import com.wzu.job.bean.JobExample;
import com.wzu.job.dao.JobMapper;
import com.wzu.job.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huhang
 * @create 2018-08-27 17:59
 */
@Service
public class JobServiceImpl implements JobService {
    @Autowired
    JobMapper jobMapper;

    @Override
    public List<Job> getList() {
        JobExample example = new JobExample();
        return jobMapper.selectByExample(null);
    }
}
