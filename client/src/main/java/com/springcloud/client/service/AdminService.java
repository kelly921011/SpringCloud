package com.springcloud.client.service;

import com.springcloud.client.Dao.AdminDao;
import com.springcloud.client.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminDao adminDao;

    public List<Admin> adminList(Integer permissions){
        return adminDao.adminList(permissions);
    }
}
