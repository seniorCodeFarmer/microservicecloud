package com.atguigu.myrule;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangchengwei
 * @create 2022-09-12 17:40
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        return new RandomRuleCustome();
    }

}
