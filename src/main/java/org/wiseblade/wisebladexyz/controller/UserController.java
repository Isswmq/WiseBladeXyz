package org.wiseblade.wisebladexyz.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.wiseblade.wisebladexyz.model.User;
import org.wiseblade.wisebladexyz.service.UserService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/")
public class UserController {

    private UserService service;

    @GetMapping
    public List<User> findAll(){
        return service.findAllUsers();
    }

    @PostMapping("save")
    public void saveUser(@RequestBody User user){
        service.saveUser(user);
    }

    @GetMapping("/{email}")
    public User findByEmail(@PathVariable String email){
        return service.findByEmail(email);
    }

}
