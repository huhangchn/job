package com.wzu.job.dao;

import com.wzu.job.bean.ResumeJob;
import com.wzu.job.bean.ResumeJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResumeJobMapper {
    long countByExample(ResumeJobExample example);

    int deleteByExample(ResumeJobExample example);

    int insert(ResumeJob record);

    int insertSelective(ResumeJob record);

    List<ResumeJob> selectByExample(ResumeJobExample example);

    int updateByExampleSelective(@Param("record") ResumeJob record, @Param("example") ResumeJobExample example);

    int updateByExample(@Param("record") ResumeJob record, @Param("example") ResumeJobExample example);
}