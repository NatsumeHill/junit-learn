package com.natsumehill.learn.rest;

import com.natsumehill.learn.AnnotationApp;
import com.natsumehill.learn.core.WebConfig;
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
 * Java Config风格的Spring MVC测试基类，其它测试类可以直接继承该类
 * 减少代码冗余
 */
@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {AnnotationApp.class, WebConfig.class})
public class WebApplicationTest {
    @Autowired
    protected WebApplicationContext context;
    protected MockMvc mockMvc;

    @Before
    public void setup(){
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    /**
     * 空测试，防止报错
     */
    @Test
    public void empty(){}
}
