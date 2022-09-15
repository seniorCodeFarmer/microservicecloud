package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhangchengwei
 * @create 2022-09-11 19:54
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerHystrixDashboard_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerHystrixDashboard_App.class, args);
    }
}
