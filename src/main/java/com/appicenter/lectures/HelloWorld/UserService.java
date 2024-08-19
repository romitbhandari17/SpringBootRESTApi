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

    public String createUser(User user){

        userRepository.save(user);
        return "user created successfully";
    }

    public String updateUser(User user){

        if(userRepository.getUserByEmail(user.getEmail()) != null){
            User userFound = userRepository.getUserByEmail(user.getEmail());
            userFound.setName(user.getName());
            userFound.setPassword(user.getPassword());
            userRepository.save(userFound);
            return "user updated successfully";
        }else{
            return "user not found";
        }
    }

    public String deleteUser(Integer userId){

        if(userRepository.getUserById(userId) != null){
            User user = userRepository.getUserById(userId);
            userRepository.delete(user);
            return "user deleted successfully";
        }else{
            return "user not found";
        }
    }
}
