package com.practice.practiceproject.controller;

import com.practice.practiceproject.dto.UserDto;
import com.practice.practiceproject.entity.User;
import com.practice.practiceproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody  UserDto userDto){
            userService.createUser(userDto);
            ResponseEntity res = new ResponseEntity(HttpStatus.CREATED);
            return res;
        }
        @GetMapping("/showAllUser")
        public List<User> showAllUser(){
            ResponseEntity res = new ResponseEntity(HttpStatus.OK);
           return userService.showAllUser();

        }
}

