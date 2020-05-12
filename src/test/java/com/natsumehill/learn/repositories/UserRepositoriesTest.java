package com.natsumehill.learn.repositories;

import com.natsumehill.learn.AnnotationApp;
import com.natsumehill.learn.po.UserPo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;
@Slf4j
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {AnnotationApp.class})
public class UserRepositoriesTest {
    @Resource
    private UserRepositories repositories;

    @Test
    public void findAll(){
        List<UserPo> userPoList = repositories.findAll();
        log.info(userPoList.toString());
    }
}