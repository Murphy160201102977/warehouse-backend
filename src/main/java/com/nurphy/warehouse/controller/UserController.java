package com.nurphy.warehouse.controller;

import com.nurphy.warehouse.pojo.Response;
import com.nurphy.warehouse.pojo.User;
import com.nurphy.warehouse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制层
 * @author Administrator
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(value="/user/register")
    public Response<User> register(@RequestBody User user){
        return userService.addUser(user);
    }
    @PostMapping(value="/user/login")
    public Response<User> login(@RequestBody User user){
        return null;
    }
    @PostMapping(value="/user/update")
    public Response<User> updateUser(@RequestBody User user){
        return null;
    }

}
