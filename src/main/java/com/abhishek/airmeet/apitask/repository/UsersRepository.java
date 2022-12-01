package com.abhishek.airmeet.apitask.repository;

import com.abhishek.airmeet.apitask.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Long> {

    Users findByAccountNumber(String accountNumber);

}
