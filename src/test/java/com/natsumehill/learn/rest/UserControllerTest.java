package com.natsumehill.learn.rest;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * 不进行模拟登录进行测试
 * 只是示例，这个测试不会成功
 */
public class UserControllerTest extends WebApplicationTest{

    @Test
    public void getUser() throws Exception {
        mockMvc.perform(get("/user/get")
                // 添加url参数
                .param("name", "kiki")
                // 添加servlet参数，可以通过HttpServletRequest.getAttribute()方法获取
                .requestAttr("auth_token","easy_token"))
                .andExpect(status().isOk())
                .andDo(print());
    }
}