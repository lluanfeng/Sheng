package com.mapper;

import com.pojo.Projectdb;
import com.pojo.ProjectdbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectdbMapper {
    long countByExample(ProjectdbExample example);

    int deleteByExample(ProjectdbExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Projectdb record);

    int insertSelective(Projectdb record);

    List<Projectdb> selectByExample(ProjectdbExample example);

    Projectdb selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Projectdb record, @Param("example") ProjectdbExample example);

    int updateByExample(@Param("record") Projectdb record, @Param("example") ProjectdbExample example);

    int updateByPrimaryKeySelective(Projectdb record);

    int updateByPrimaryKey(Projectdb record);
}