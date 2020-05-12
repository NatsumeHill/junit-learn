package com.natsumehill.learn;

import com.natsumehill.learn.po.UserPo;
import com.natsumehill.learn.service.UserService;
import com.natsumehill.learn.service.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

/**
 * 基于XML文件配置Spring IoC
 */
@Slf4j
public class XmlApp {
    private static final String CONFIG_FILE = "classpath:/spring/*";
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_FILE);
        UserService<UserPo> userService =  context.getBean(UserServiceImpl.class);
        Assert.notNull(userService, "");
        log.info(userService.getUser(new UserPo("kiki",null,null)).toString());
    }
}
