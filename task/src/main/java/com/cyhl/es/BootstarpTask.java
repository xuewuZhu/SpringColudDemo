package com.cyhl.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by zhuxuewu  on 2018/7/11 11:19.
 * Email: xuewu.zhu@plusx.cn
 * Copyright (c) 2014 承影互联(科技)有限公司 版权所有
 */
@EnableScheduling
@SpringBootApplication(scanBasePackages={"com.cyhl.es"})
public class BootstarpTask extends SpringBootServletInitializer {
    public static void main(String[] args){
        SpringApplication.run(BootstarpTask.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}
