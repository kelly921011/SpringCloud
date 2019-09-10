package com.springcloud.customer.service;

import com.springcloud.customer.entity.Admin;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ErrorService implements FeignService {
    @Override
    public String StringService() {
        return "Sorry, service access failed!";
    }

    @Override
    public List<Admin> FeignList(Integer permissions) {
        return null;
    }
}
