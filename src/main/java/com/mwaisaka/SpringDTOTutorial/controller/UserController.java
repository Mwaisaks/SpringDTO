package com.mwaisaka.SpringDTOTutorial.controller;

import com.mwaisaka.SpringDTOTutorial.dto.UserLocationDTO;
import com.mwaisaka.SpringDTOTutorial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users-location")
    public List<UserLocationDTO> getAllUsersLocationDTO(){
        return userService.getAllUsersLocation();
    }
}
