package com.natsumehill.learn.core;

import com.natsumehill.learn.common.Common;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 简易登录拦截
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        if(session.getAttribute(Common.SESSION_KEY) != null) return true;
        // 如果没有登录，直接返回HTTP-403
        response.sendError(HttpServletResponse.SC_FORBIDDEN);
        return false;
    }
}
