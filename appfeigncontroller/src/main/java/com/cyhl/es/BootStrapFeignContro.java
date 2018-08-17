package com.cyhl.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhuxuewu  on 2018/5/4 11:33.
 * Email: xuewu.zhu@plusx.cn
 * Copyright (c) 2014 承影互联(科技)有限公司 版权所有
 * 可以注册为eurake的客户端 和服务发现的能力
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"com.cyhl.es"})
public class BootStrapFeignContro extends SpringBootServletInitializer {

    public static void main(String[] args){
        SpringApplication.run(BootStrapFeignContro.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}
