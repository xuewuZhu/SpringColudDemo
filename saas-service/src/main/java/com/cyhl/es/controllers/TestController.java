package com.cyhl.es.controllers;


import com.cyhl.es.dto.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhuxuewu  on 2018/6/8 13:50.
 * Email: xuewu.zhu@plusx.cn
 * Copyright (c) 2014 承影互联(科技)有限公司 版权所有
 */
@RestController
public class TestController {

    private final Logger logger= Logger.getLogger(getClass());
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index(){
        ServiceInstance instance=discoveryClient.getLocalServiceInstance();
        logger.info("/hello, host:"+instance.getHost()+", service_id:"+instance.getServiceId());
        return "Hello word";
    }

    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    public String hello(@RequestParam String name){
        return "hello "+ name;
    }

    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public User hello(@RequestHeader String name,@RequestHeader Integer age)
    {
        return new User(name,age);
    }

    @RequestMapping(value = "hello3",method = RequestMethod.POST)
    public String hello(@RequestBody User user){
        return "hello "+ user.getName()+ "  "+user.getAge();
    }


}
