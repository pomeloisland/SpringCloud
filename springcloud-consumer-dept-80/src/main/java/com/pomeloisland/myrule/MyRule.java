package com.pomeloisland.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRule {

    @Bean
    public IRule myIRule(){
        return new MyRandomRule();   //默认是轮询,现在定义为MyRandomRule
    }
}
