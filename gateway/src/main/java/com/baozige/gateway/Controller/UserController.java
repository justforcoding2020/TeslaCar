package com.baozige.gateway.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("User")
public class UserController {

    //增加用户信息
    @PostMapping("/add")
    public UserInfo addUserInfo (@RequestBody UserInfo userInfo){

    }
    @PutMapping("/auth/admin/change")
    public UserInfo changeUserInfo(@RequestParam String name, HttpServletRequest request){
        String header = request.getHeader(String token);
      Sting userId =  header.getUserId(token);
      return null;
    }
    @DeleteMapping ("/auth/admin/remove")
    public UserInfo changeUserInfo(@RequestParam String name, HttpServletRequest request){
        String header = request.getHeader(String token);
        Sting userId =  header.getUserId(token);
        return null;
    }
}
