package com.springcloud.ribbon.controller;

import com.springcloud.ribbon.entity.Admin;
import com.springcloud.ribbon.servcie.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {
    @Autowired
    private RibbonService testService;
    @RequestMapping("/string")
    public String findString(){
        return testService.StringServcie();
    }
    @RequestMapping("/list")
    public List<Admin> AdminList(Integer permissions){
        return testService.ListService(permissions);
    }
}
