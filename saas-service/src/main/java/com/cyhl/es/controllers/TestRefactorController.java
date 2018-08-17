package com.cyhl.es.controllers;

import com.cyhl.es.api.HelloService;
import com.cyhl.es.dto.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuxuewu  on 2018/6/15 11:12.
 * Email: xuewu.zhu@plusx.cn
 * Copyright (c) 2014 承影互联(科技)有限公司 版权所有
 */
@RestController
public class TestRefactorController implements HelloService {
//    @Override
//    public String hello(String name) {
//        return " Refactor Hello " + name;
//    }
//
//    @Override
//    public User hello(String name, Integer age) {
//        return new User(name,age);
//    }
//
//    @Override
//    public String hello(User user) {
//        return "Refactor Hello "+user.getName()+", "+user.getAge();
//    }
    @Override
    public String hello(@RequestParam("name") String name) {
        return " Refactor Hello " + name;
    }

    @Override
    public User hello(@RequestHeader("name") String name,@RequestHeader("age") Integer age) {
        return new User(name,age);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "Refactor Hello "+user.getName()+", "+user.getAge();
    }
}
