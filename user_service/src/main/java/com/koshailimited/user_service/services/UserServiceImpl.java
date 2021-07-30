package com.koshailimited.user_service.services;

import com.koshailimited.user_service.entity.User;

import java.util.List;

public class UserServiceImpl implements UserService{

    List<User> list = List.of(

            new User(1803121L, "Toriqul islam", "01872856877"),
            new User(1803122L, "Nafis Walid", "01872856877"),
            new User(1803123L, "Shakib Bro", "01872856877")
    );

    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null) ;
    }
}
