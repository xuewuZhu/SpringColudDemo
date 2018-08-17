package com.cyhl.es.controllers;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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
    private RestTemplate restTemplate;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index(){
       return restTemplate.getForEntity("http://HELLO-SERVER/hello",String.class).getBody();
    }
}
