package com.springboot.application.Application.controller;

import com.springboot.application.Application.dao.UserDAO;
import com.springboot.application.Application.entity.UserC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController  {
    @Autowired
    UserDAO userDAO;
    @PostMapping
    public  UserC adduser( @RequestBody UserC userC){
        userC.setUserId(UUID.randomUUID().toString());
        return  userDAO.sav(userC);

    }
    @GetMapping("/{userId}")
    public UserC getUserByID(@PathVariable String userId){
        return userDAO.get(userId);
    }
    @GetMapping
    public Map<Object,Object> getAll(){
        return userDAO.getAll();
    }
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable String userId){
        userDAO.delete(userId);
    }
}
