package org.binar.msib.CinemaApp.controller;

import org.binar.msib.CinemaApp.dto.FilmDTO;
import org.binar.msib.CinemaApp.dto.UserDTO;
import org.binar.msib.CinemaApp.entity.EntityUser;
import org.binar.msib.CinemaApp.entity.Film;
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
    @PostMapping("/add")
    public UserDTO insertUser(@RequestBody UserDTO request){
        EntityUser entityUser = userService.mapToEntity(request);
        EntityUser result = userService.insertUser(entityUser);
        return userService.mapToDto(result);
    }
    //update user
    @PutMapping("/update")
    public void updateUser(@RequestBody EntityUser entityUser, Integer user_id){
        userService.updateUser(entityUser, user_id);
    }
    //delete user
    @DeleteMapping("/delete")
    public void deleteUser(@RequestBody Integer user_id){
        userService.delete(user_id);
    }
}
