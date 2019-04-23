package com.controller;

import com.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Iman
 * date   : 2019/4/22
 */
@RestController
public class Testcontroller {
    @RequestMapping("test")
    public User getUser(){
        User user=new User("斯蒂卡","123456");
        return user;
    }
}
