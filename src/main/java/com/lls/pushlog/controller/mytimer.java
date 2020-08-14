package com.lls.pushlog.controller;

import com.lls.pushlog.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @Description TODO
 * @author: leijun
 * @date: mytimer
 */
@Configuration          //证明这个类是一个配置文件
@EnableScheduling       //启用定时器
public class mytimer {
    Logger logger = LoggerFactory.getLogger(UserRestful.class);
    @Autowired
    UserService userService;

    @Scheduled(cron = "0/10 * * * * *")
    public void runTimer() {
        logger.info("==start==");
        long startTime = System.currentTimeMillis();
        //调用userService方法查询用户并输出
        System.out.println(userService.findAll());
        logger.error("test error!");
        long endTime = System.currentTimeMillis();
        logger.debug("costTime:[{}ms]",endTime-startTime);
        logger.info("==end==");
    }
}
