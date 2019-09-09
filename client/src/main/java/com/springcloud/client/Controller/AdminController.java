package com.springcloud.client.Controller;

import com.springcloud.client.entity.Admin;
import com.springcloud.client.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/list")
    public List<Admin> home(Integer permissions){
        return adminService.adminList(permissions);
    }
    @RequestMapping("/string")
    public String home(){
        return "Stirng";
    }
}
