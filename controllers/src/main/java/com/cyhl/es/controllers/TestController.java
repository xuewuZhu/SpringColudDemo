package com.cyhl.es.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhuxuewu  on 2018/5/4 11:37.
 * Email: xuewu.zhu@plusx.cn
 * Copyright (c) 2014 承影互联(科技)有限公司 版权所有
 */
@RestController
public class TestController {


    @RequestMapping(value = "/test/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello word";
    }

}
