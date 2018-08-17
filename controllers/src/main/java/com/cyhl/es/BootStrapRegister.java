package com.cyhl.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by zhuxuewu  on 2018/5/4 11:33.
 * Email: xuewu.zhu@plusx.cn
 * Copyright (c) 2014 承影互联(科技)有限公司 版权所有
 */
@EnableEurekaServer
@SpringBootApplication(scanBasePackages={"com.cyhl.es"})
public class BootStrapRegister extends SpringBootServletInitializer {
    public static void main(String[] args){
        SpringApplication.run(BootStrapRegister.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}
