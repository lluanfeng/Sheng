package com.mapper;

import com.pojo.Pro;
import com.pojo.ProExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProMapper {
    long countByExample(ProExample example);

    int deleteByExample(ProExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pro record);

    int insertSelective(Pro record);

    List<Pro> selectByExample(ProExample example);

    Pro selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pro record, @Param("example") ProExample example);

    int updateByExample(@Param("record") Pro record, @Param("example") ProExample example);

    int updateByPrimaryKeySelective(Pro record);

    int updateByPrimaryKey(Pro record);
}