package com.lls.pushlog.controller;

import com.lls.pushlog.entity.User;
import com.lls.pushlog.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @author: leijun
 * @date: UserRestful
 */
@RestController
@RequestMapping("/user")
public class UserRestful<UserGroupRelationService, UserGroupService, IAuthentication> {

    Logger logger = LoggerFactory.getLogger(UserRestful.class);

    @Resource
    private UserService userService;

    /**
     * @Description: 测试logback
     * @param
     * @Return: java.util.Map<java.lang.String,java.lang.Object>
     * @Author: laosan
     * @Date: 2019/12/27
    **/
    @GetMapping("/getAllUser")
    public Map<String,Object> getAllUser(){
        logger.info("==start==");
        long startTime = System.currentTimeMillis();
        Map<String,Object> resultMap = new HashMap<String, Object>();
        resultMap.put("allUser",userService.findAll());
        logger.error("test error!");
        long endTime = System.currentTimeMillis();
        logger.debug("costTime:[{}ms]",endTime-startTime);
        logger.info("==end==");
        return resultMap;
    }


}
