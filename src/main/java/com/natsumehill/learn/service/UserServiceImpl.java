package com.natsumehill.learn.service;

import com.natsumehill.learn.po.UserPo;
import com.natsumehill.learn.repositories.UserRepositories;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户服务示例
 */
@Service
public class UserServiceImpl implements UserService<UserPo> {
    @Resource
    private UserRepositories repositories;

    @Override
    public List<UserPo> getUser(UserPo userPo) {
        return repositories.findByName(userPo.getName());
    }
}
