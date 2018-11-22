package com.agent.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@Slf4j
@EnableTransactionManagement
public class AgentCoreServiceApplication {

    public static void main(String[] args) {

        log.info("====启动开始====");
        SpringApplication springApplication = new SpringApplication(AgentCoreServiceApplication.class);
        springApplication.addListeners(new ApplicationPidFileWriter());
        springApplication.run(args);
        log.info("====启动结束====");
    }
}
