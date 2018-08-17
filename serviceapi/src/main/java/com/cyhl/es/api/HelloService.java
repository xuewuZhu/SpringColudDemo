package com.cyhl.es.api;

import com.cyhl.es.dto.User;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhuxuewu  on 2018/6/14 17:13.
 * Email: xuewu.zhu@plusx.cn
 * Copyright (c) 2014 承影互联(科技)有限公司 版权所有
 */
public interface HelloService {

    @RequestMapping(value = "/hello4",method = RequestMethod.GET)
    public String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello5",method = RequestMethod.GET)
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "hello6",method = RequestMethod.POST)
    public String hello(@RequestBody User user);
}
