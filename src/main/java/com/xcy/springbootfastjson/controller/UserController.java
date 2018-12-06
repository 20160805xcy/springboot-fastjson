package com.xcy.springbootfastjson.controller;

import com.xcy.springbootfastjson.model.User;
import com.xcy.springbootfastjson.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xcy
 * @date 2018/12/04 9:40
 * @description UserController
 * @since V1.0.0
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "findAllUser")
    public List<User> findAllUser(){
        return userService.listAll();
    }

    @RequestMapping(value = "findUserById/{id}")
    public User findUserById(@PathVariable Integer id){
        return userService.findUserById(id);
    }
}
