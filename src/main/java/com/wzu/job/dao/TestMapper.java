package com.wzu.job.dao;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @author huhang
 * @create 2018-08-26 16:24
 */

public interface TestMapper {
    Date queryNow();
}
