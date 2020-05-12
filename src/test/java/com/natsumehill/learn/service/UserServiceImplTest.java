package com.natsumehill.learn.service;

import com.natsumehill.learn.AnnotationApp;
import com.natsumehill.learn.po.UserPo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * 基于Java Config的Service类测试示例
 */
@Slf4j
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AnnotationApp.class)
public class UserServiceImplTest {
    @Autowired
    private UserService<UserPo> userService;
    @Test
    public void getUser() {
        log.info(userService.getUser(new UserPo("kiki", null, null)).toString());
    }
}