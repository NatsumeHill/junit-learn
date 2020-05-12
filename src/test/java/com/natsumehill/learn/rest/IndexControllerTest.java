package com.natsumehill.learn.rest;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class IndexControllerTest extends WebApplicationTest{

    @Test
    public void index() throws Exception {
        mockMvc.perform(get("/"))
                //响应状态码比对
                .andExpect(status().isOk())
                //响应文本比对
        .andExpect(content().string("Hello junit"))
        .andDo(print());
    }
}