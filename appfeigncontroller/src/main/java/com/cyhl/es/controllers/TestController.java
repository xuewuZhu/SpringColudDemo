package com.cyhl.es.controllers;


import com.cyhl.es.dto.User;
import com.cyhl.es.service.RefactorHelloService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhuxuewu  on 2018/6/8 13:50.
 * Email: xuewu.zhu@plusx.cn
 * Copyright (c) 2014 承影互联(科技)有限公司 版权所有
 */
@RestController
public class TestController {

    private final Logger logger= Logger.getLogger(getClass());

    @Autowired
    private RefactorHelloService refactorHelloService;



    @RequestMapping(value = "/feign-hello2",method = RequestMethod.GET)
    public String index2(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(refactorHelloService.hello("didi")).append("\n");
        stringBuilder.append(refactorHelloService.hello("didi",27)).append("\n");
        stringBuilder.append(refactorHelloService.hello(new User("didi",28))).append("\n");
        System.out.println("sdfdsfadsfadsfdsf");
        return stringBuilder.toString();
    }


}
