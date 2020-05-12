package com.natsumehill.learn.rest;

import com.natsumehill.learn.po.UserPo;
import com.natsumehill.learn.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController()
@RequestMapping("/user")
public class UserController {
    private final UserService<UserPo> userService;

    public UserController(UserService<UserPo> userService) {
        this.userService = userService;
    }

    @ResponseBody
    @GetMapping("/get")
    public String getUser(@RequestParam String name, HttpServletRequest request){
        log.info("request param: name=" + name);
        Object attribute = request.getAttribute("auth_token");
        if(attribute != null){
            log.info("You got token:" + attribute.toString());
        }
        List<UserPo> userPoList = userService.getUser(new UserPo(name, null, null));
        if(userPoList == null){
            userPoList = new ArrayList<>(0);
        }
        return userPoList.toString();
    }
}
