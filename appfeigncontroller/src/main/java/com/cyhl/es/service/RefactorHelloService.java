package com.cyhl.es.service;

import com.cyhl.es.api.HelloService;
import com.cyhl.es.fallback.HelloServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by zhuxuewu  on 2018/6/15 11:19.
 * Email: xuewu.zhu@plusx.cn
 * Copyright (c) 2014 承影互联(科技)有限公司 版权所有
 */
@FeignClient(value = "hello-server",fallback = HelloServiceFallback.class)
public interface RefactorHelloService extends HelloService {
}
