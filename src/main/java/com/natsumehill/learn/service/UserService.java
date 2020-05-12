package com.natsumehill.learn.service;

import java.util.List;

public interface UserService<E> {
    /**
     * 查找用户
     * @param e 用户实体部分信息
     * @return
     */
    List<E> getUser(E e);
}
