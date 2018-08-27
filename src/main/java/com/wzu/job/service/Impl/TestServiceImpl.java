package com.wzu.job.service.Impl;

import com.wzu.job.dao.TestMapper;
import com.wzu.job.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author huhang
 * @create 2018-08-26 16:24
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestMapper testMapper;

    @Override
    public Date queryNow() {
        return testMapper.queryNow();
    }
}
