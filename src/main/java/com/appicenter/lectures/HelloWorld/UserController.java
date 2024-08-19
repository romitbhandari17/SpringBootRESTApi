package com.appicenter.lectures.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable Integer userId){
        return userService.getUser(userId);
    }

    @PostMapping("/create")
    public String createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody User user){

        return userService.updateUser(user);
    }

    @DeleteMapping("/delete/{userId}")
    public String updateUser(@PathVariable Integer userId){

        return userService.deleteUser(userId);
    }
}
