package com.cyhl.es.configs;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.leader.LeaderSelector;
import org.apache.curator.framework.recipes.leader.LeaderSelectorListenerAdapter;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by zhuxuewu  on 2018/7/11 12:03.
 * Email: xuewu.zhu@plusx.cn
 * Copyright (c) 2014 承影互联(科技)有限公司 版权所有
 */
@Component
public class MyRunner implements CommandLineRunner {

    static String master_path = "/curator_master_path";
    static  CuratorFramework client = CuratorFrameworkFactory.builder()
            .connectString("")
            .retryPolicy(new ExponentialBackoffRetry(1000,3)).build();
    @Override
    public void run(String... strings) throws Exception {
        client.start();
        LeaderSelector selector= new LeaderSelector(client, master_path,
                new LeaderSelectorListenerAdapter() {
                    @Override
                    public void takeLeadership(CuratorFramework curatorFramework) throws Exception {
                        System.out.println("成为master");
                        Thread.sleep(3000);
                        System.out.println("完成master操作，释放master权利");
                    }
                });
        selector.autoRequeue();
        selector.start();
        Thread.sleep(Integer.MAX_VALUE);
    }
}
