package com.appicenter.lectures.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getUser(Integer userId){

        return userRepository.getUserById(userId);
    }
}
