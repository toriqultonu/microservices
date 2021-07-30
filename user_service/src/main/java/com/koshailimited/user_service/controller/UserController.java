package com.koshailimited.user_service.controller;

import com.koshailimited.user_service.entity.User;
import com.koshailimited.user_service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId){

        User user = this.userService.getUser(userId);

        List contacts = this.restTemplate.getForObject("http://contact-service/contact/user/"+userId, List.class);

        user.setContacts(contacts);

        return user;
    }
}
