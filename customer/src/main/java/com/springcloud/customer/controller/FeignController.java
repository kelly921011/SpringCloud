package com.springcloud.customer.controller;

import com.springcloud.customer.entity.Admin;
import com.springcloud.customer.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feign")
public class FeignController {
    @Autowired
    private FeignService feignService;

    @RequestMapping("/string")
    public String FeignString(){
        return feignService.StringService();
    }
    @RequestMapping("/list")
    public List<Admin> FeignList(Integer permissions){
        return feignService.FeignList(permissions);
    }
}
