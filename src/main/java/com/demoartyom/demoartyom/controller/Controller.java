package com.demoartyom.demoartyom.controller;

import com.demoartyom.demoartyom.model.Users;
import com.demoartyom.demoartyom.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping("user")
public class Controller {

    UserService userService;

    @GetMapping("/{userId}")
    public Users getUser(@PathVariable String userId){
        return userService.findById(Long.parseLong(userId));

    }

    @PostMapping
    public long addUser(@RequestBody Users user){
        return userService.save(user);
    }

    @PutMapping ("/{userId}")
    public Map<String, String> updateUserStatus(@PathVariable String userId){

        return userService.updateUser(Long.parseLong(userId));
    }


}
