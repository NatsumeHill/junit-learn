package com.natsumehill.learn.rest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Xml风格配置测试类初始化基类
 */
@RunWith(SpringRunner.class)
// 配置文件需要包含spring mvc的配置文件
@ContextConfiguration(locations = {"classpath:/spring/*"})
@WebAppConfiguration(value = "src/main/web")
public class XmlWebApplicationTest {
    @Autowired
    protected WebApplicationContext context;
    protected MockMvc mockMvc;

    @Before
    public void setup(){
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void empty(){}
}
