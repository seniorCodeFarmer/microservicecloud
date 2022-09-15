package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author zhangchengwei
 * @create 2022-09-11 18:12
 */
@SpringBootApplication
@MapperScan("com.atguigu.springcloud.dao")
@EnableEurekaClient
@EnableCircuitBreaker//对hystrix熔断机制的支持
public class DeptProviderHystrix_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix_App.class,args);
    }
}
