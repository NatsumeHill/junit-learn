package com.natsumehill.learn.service;

import com.natsumehill.learn.po.UserPo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 基于Xml配置的测试环境初始化基类
 */

@Slf4j
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/bean.xml", "classpath:/spring/repositories.xml"})
public class XmlConfigTest {
    @Autowired
    private UserService<UserPo> userService;

    @Test
    public void userServiceTest(){
        log.info(userService.getUser(new UserPo("kiki", null, null)).toString());
    }
}
