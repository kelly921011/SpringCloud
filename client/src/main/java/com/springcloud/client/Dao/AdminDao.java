package com.springcloud.client.Dao;

import com.springcloud.client.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminDao {
    public List<Admin> adminList(@Param("permissions") Integer permissions);
}
