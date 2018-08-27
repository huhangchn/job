package com.wzu.job.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzu.job.bean.Job;
import com.wzu.job.service.JobService;
import com.wzu.job.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


/**
 * @author huhang
 * @create 2018-08-26 16:10
 */

@Controller
public class TestController {

    @Autowired
    JobService jobService;

    @RequestMapping("/showJobs")
    public String showJobs(Map<String,Object> map){
        Page<Object> page = PageHelper.startPage(0, 10);
        List<Job> jobs = jobService.getList();
        PageInfo pageInfo = new PageInfo(jobs,5);
        map.put("pageInfo",pageInfo);
        return "jobs";
    }


    @Autowired
    TestService testService;

    @RequestMapping("queryNow")
    @ResponseBody
    public String queryNow(){
        return testService.queryNow().toString();
    }

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
