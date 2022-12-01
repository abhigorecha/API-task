package com.abhishek.airmeet.apitask.service;

import com.abhishek.airmeet.apitask.entity.Users;
import com.abhishek.airmeet.apitask.model.UsersModel;
import com.abhishek.airmeet.apitask.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UsersRepository usersRepository;

    public List<UsersModel> fetchAllUsers() {
        return usersRepository.findAll().stream()
                .map(UsersModel::new)
                .collect(Collectors.toList());
    }

    public Long saveUser(UsersModel usersModel) {
        return usersRepository.save(new Users(usersModel)).getId();
    }

    public UsersModel fetchByAccountNumber(String accountNumber) {
        Users users = usersRepository.findByAccountNumber(accountNumber);
        if (users == null)
            return null;
        return new UsersModel(users);
    }

}
