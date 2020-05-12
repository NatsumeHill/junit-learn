package com.natsumehill.learn.rest;

import com.natsumehill.learn.common.Common;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.web.servlet.MvcResult;

import javax.servlet.http.HttpSession;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * 模拟登录验证示例
 */
@Slf4j
public class WebApplicationWithSessionTest extends WebApplicationTest {
    protected MockHttpSession session;

    @Before
    public void setUp() throws Exception {
        session = ((MockHttpSession) login());
        log.info("You got login session: " + session.getAttribute(Common.SESSION_KEY).toString());

    }

    private HttpSession login() throws Exception {
        MvcResult result = mockMvc.perform(post("/login/do"))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();
        return result.getRequest().getSession();
    }

    @Test
    public void empty(){}
}
