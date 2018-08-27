package com.wzu.job.dao;

import com.wzu.job.bean.Intention;
import com.wzu.job.bean.IntentionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntentionMapper {
    long countByExample(IntentionExample example);

    int deleteByExample(IntentionExample example);

    int insert(Intention record);

    int insertSelective(Intention record);

    List<Intention> selectByExample(IntentionExample example);

    int updateByExampleSelective(@Param("record") Intention record, @Param("example") IntentionExample example);

    int updateByExample(@Param("record") Intention record, @Param("example") IntentionExample example);
}