package com.baozige.gateway.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("User")
public class UserController {

    //增加用户信息
    @PostMapping("/add")
    public UserInfo addUserInfo (@RequestBody UserInfo userInfo){

    }
}
