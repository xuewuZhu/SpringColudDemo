package com.cyhl.es.task;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by zhuxuewu  on 2018/7/11 11:33.
 * Email: xuewu.zhu@plusx.cn
 * Copyright (c) 2014 承影互联(科技)有限公司 版权所有
 */
@Component
public class TestTask {

    @Value("${new.account.date}")
    private String newAccountDate;

    @Scheduled(cron="*/3 * * * * ?")
    public void test(){
        System.out.println(newAccountDate);
    }
}
