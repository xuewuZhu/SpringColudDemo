package com.cyhl.es.fallback;

import com.cyhl.es.dto.User;
import com.cyhl.es.service.RefactorHelloService;
import org.springframework.stereotype.Component;

/**
 * Created by zhuxuewu  on 2018/6/15 15:37.
 * Email: xuewu.zhu@plusx.cn
 * Copyright (c) 2014 承影互联(科技)有限公司 版权所有
 */
@Component
public class HelloServiceFallback implements RefactorHelloService{
    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User("世界杯",2018);
    }

    @Override
    public String hello(User user) {
        return "error";
    }
}
