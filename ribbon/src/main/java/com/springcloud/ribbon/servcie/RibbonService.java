package com.springcloud.ribbon.servcie;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.springcloud.ribbon.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * @HystrixCommand注解定义了一个断路器，它封装了StringServcie()方法， 当它访问的CLIENT失败达到阀值后，
     * 将不会再调用CLIENT， 取而代之的是返回由fallbackMethod定义的方法ribbonError()。
     * 注意：
     *      1.fallbackMethod的返回值和参数类型需要和被@HystrixCommand注解的方法完全一致。否则会在运行时抛出异常；
     *      2.当底层服务失败后，fallbackMethod替换的不是整个被@HystrixCommand注解的方法（本例中的StringServcie),
     *      替换的只是通过restTemplate去访问的具体服务。可以从中的system输出看到， 即使失败，控制台输出里面依然会有“ribbon error”。
     * @return
     */
    @HystrixCommand(fallbackMethod = "ribbonError")
    public String StringServcie(){
        return restTemplate.getForObject("http://CLIENT/admin/string",String.class);
    }

    public List<Admin> ListService(Integer permissions){
        /**
         * 方法getForObject(url,?.class)中的url必须使用服务提供者的项目名称“CLIENT”,不能使用IP地址
         * RestTemplate接收List集合数据时，必须用数组接收
         */
        Admin[] admin=restTemplate.getForObject("http://CLIENT/admin/list?permissions="+permissions,Admin[].class);
        for(Admin a:admin){
            System.out.println(a.getAdmin_name());
        }
        List<Admin> list= Arrays.asList(admin);
        return list;
    }

    public String ribbonError(){
        return "ribbon error";
    }
}
