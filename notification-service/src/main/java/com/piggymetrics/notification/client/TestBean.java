package com.piggymetrics.notification.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class TestBean implements CommandLineRunner {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private AccountServiceClient client;

    @Override
    public void run(String... args) throws Exception {
        String attachment = client.getAccount("demo");
        log.info("获取account-service接口数据:{}",attachment);
    }
}
