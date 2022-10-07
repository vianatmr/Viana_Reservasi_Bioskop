package org.binar.msib.CinemaApp.controller;

import org.binar.msib.CinemaApp.entity.EntityUser;
import org.binar.msib.CinemaApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    //add user
    @PostMapping("/user")
    public void insertUser(@RequestBody EntityUser entityUser){
        userService.insertUser(entityUser);
    }
    //update user
    @PutMapping("/user")
    public void updateUser(@RequestBody EntityUser entityUser, Integer user_id){
        userService.updateUser(entityUser, user_id);
    }
    //delete user
    @DeleteMapping("/user")
    public void deleteUser(@RequestBody Integer user_id){
        userService.delete(user_id);
    }
}
