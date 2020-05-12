package com.natsumehill.learn.service;

import com.natsumehill.learn.po.UserPo;
import com.natsumehill.learn.repositories.UserRepositories;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * 使用Mockito模拟其它组件，这样就不需要启动Spring IoC
 */
@Slf4j
// 初始化，完成注解解析
@RunWith(MockitoJUnitRunner.class)
public class MockitoUserServiceImplTest {
    // UserService 依赖于UserRepositories，通过@Mock来模拟
    @Mock
    private UserRepositories repositories;

    // 需要注入模拟对象的目标类
    @InjectMocks
    private UserServiceImpl userService;

    /*@Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }*/

    @Test
    public void getUser() {
        // 模拟UserRepositories的行为，当指定方法被调用且参数一致时，返回模拟结果
        when(repositories.findByName("kiki"))
                .thenReturn(new ArrayList<UserPo>(){{
                    add(new UserPo("kiki",null,"9999999"));
                }});
        log.info(userService.getUser(new UserPo("kiki",null, null)).toString());
    }
}