package com.air.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.air.demo.model.User;
@Mapper
public interface UserMapper {
	
    @Select("select id,name,age from usertest where id=#{id}")
    User getById(@Param("id") Long id);
}
