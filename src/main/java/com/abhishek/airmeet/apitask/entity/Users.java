package com.abhishek.airmeet.apitask.entity;

import com.abhishek.airmeet.apitask.model.UsersModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String accountNumber;

    @Column(unique = true)
    private String email;
    private LocalDate birthDate;

    public Users(UsersModel usersModel) {
        this(
                null,
                usersModel.getFirstName(),
                usersModel.getLastName(),
                usersModel.getAccountNumber(),
                usersModel.getEmail(),
                usersModel.getBirthDate()
        );
    }

}
