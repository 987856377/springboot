package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by daier on 2018/1/11.
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("index")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<User> listUser(){
        return userService.getAllUser();
    }

    @RequestMapping("addUser")
    public String addUser(){
        User user = new User();
        user.setUsername("jeck");
        user.setPassword("123456");
        user.setAge(24);
        userService.addUser(user);
        return "success";
    }

    @RequestMapping("updateUser")
    public String updateUser(){
        User user = new User();
        user.setId(1220);
        user.setUsername("jeck");
        user.setPassword("root");
        user.setAge(25);
        userService.updateUser(user);
        return "success";
    }

    /*
        @RequestMapping("deleteUser/{id}")
        public String updateUser(@PathVariable("id") int id){
            userService.deleteUser(id);
            return "success";
        }
     */
    @RequestMapping("deleteUser")
    public String updateUser(@RequestParam("id") int id){
        userService.deleteUser(id);
        return "success";
    }
}
