package com.practiceMicro.PUserService.controllers;

import com.practiceMicro.PUserService.entities.UserEntity;
import com.practiceMicro.PUserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserEntity> createNewUser(@RequestBody UserEntity inputUser){
        UserEntity user1 = userService.saveUser(inputUser);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserEntity> getSingleUser(@PathVariable String userId) {
        UserEntity user = userService.getUser(userId);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity<List<UserEntity>> getAllUsers(){
        List<UserEntity> allUser = userService.getAllUsers();
        return ResponseEntity.ok(allUser);
    }


}
