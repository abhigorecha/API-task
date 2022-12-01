package com.abhishek.airmeet.apitask.controller;

import com.abhishek.airmeet.apitask.model.UsersModel;
import com.abhishek.airmeet.apitask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UsersModel> fetchAllUsers() {
        return userService.fetchAllUsers();
    }

    @PostMapping("/users")
    public Long saveUser(@RequestBody @Valid UsersModel usersModel) {
        return userService.saveUser(usersModel);
    }

    @GetMapping("/users/{accountNumber}")
    public UsersModel findByAccountNumber(@PathVariable String accountNumber) {
        return userService.fetchByAccountNumber(accountNumber);
    }

}
