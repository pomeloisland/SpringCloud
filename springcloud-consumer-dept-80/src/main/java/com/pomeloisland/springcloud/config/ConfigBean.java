package com.pomeloisland.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean { //@Configuration -- spring  applicationContext.xml

    // IRule
    // RoundRobinRule 轮询
    // RandomRule 随机
    // RetryRule: 会先按照轮询获取服务~ 如果服务获取失败,则会在指定的时间内进行重试
    // AvailabilityFilteringRule: 会先过滤掉跳闸的服务~,对剩下的进行轮询~

    @Bean
    @LoadBalanced  //Ribbon 配置负载均衡实现RestTemplate
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
