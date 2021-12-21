package com.pomeloisland.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//Ribbon 和 eureka 整合以后,客户端可以直接调用,不用关心IP地址和端口号
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.pomeloisland.springcloud"})
// 切记不要加这个注解,不然会出现404访问不到
// @ComponentScan("com.pomeloisland.springcloud")
public class FeignDeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer_80.class,args);
    }
}
