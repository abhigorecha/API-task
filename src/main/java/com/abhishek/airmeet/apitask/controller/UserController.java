package com.abhishek.airmeet.apitask.controller;

import com.abhishek.airmeet.apitask.model.UsersModel;
import com.abhishek.airmeet.apitask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity findByAccountNumber(@PathVariable String accountNumber) {
        UsersModel user = userService.fetchByAccountNumber(accountNumber);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity
                    .notFound()
                    .build();
        }
    }

}
