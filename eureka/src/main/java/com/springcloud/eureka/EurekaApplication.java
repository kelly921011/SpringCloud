package com.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @EnableEurekaServer 启动一个服务注册中心提供给其他应用进行对话
 *     @EnadbleEuredaServe Import导入了EurekaMarkerConfiguration类，eurekaServerMarkerBean会往Spring容器中注入一个空类Marker；
 *     通过注解可以看出Marker类是一个开关标志，用了激活EurekaServerAutoConfiguration类。
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
