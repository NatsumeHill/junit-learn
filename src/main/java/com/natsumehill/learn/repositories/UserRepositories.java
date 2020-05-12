package com.natsumehill.learn.repositories;

import com.natsumehill.learn.po.UserPo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepositories extends JpaRepository<UserPo, Long> {

    List<UserPo> findByName(String name);
}
