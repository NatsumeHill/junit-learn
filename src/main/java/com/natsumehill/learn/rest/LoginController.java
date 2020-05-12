package com.natsumehill.learn.rest;

import com.natsumehill.learn.common.Common;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.UUID;

@RestController
@RequestMapping("/login")
public class LoginController {

    @PostMapping("/do")
    @ResponseBody
    public String doLogin(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute(Common.SESSION_KEY, String.join("",UUID.randomUUID().toString().split("-")));
        return "";
    }
}
