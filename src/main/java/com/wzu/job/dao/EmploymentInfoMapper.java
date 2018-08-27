package com.wzu.job.dao;

import com.wzu.job.bean.EmploymentInfo;
import com.wzu.job.bean.EmploymentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmploymentInfoMapper {
    long countByExample(EmploymentInfoExample example);

    int deleteByExample(EmploymentInfoExample example);

    int insert(EmploymentInfo record);

    int insertSelective(EmploymentInfo record);

    List<EmploymentInfo> selectByExample(EmploymentInfoExample example);

    int updateByExampleSelective(@Param("record") EmploymentInfo record, @Param("example") EmploymentInfoExample example);

    int updateByExample(@Param("record") EmploymentInfo record, @Param("example") EmploymentInfoExample example);
}