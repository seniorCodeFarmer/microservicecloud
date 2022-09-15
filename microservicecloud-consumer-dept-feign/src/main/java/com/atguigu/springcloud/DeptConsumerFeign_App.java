package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhangchengwei
 * @create 2022-09-11 19:54
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.atguigu.springcloud"})
@ComponentScan("com.atguigu")
public class DeptConsumerFeign_App {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DeptConsumerFeign_App.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {

            System.out.println(beanDefinitionName);
        }
    }
}
