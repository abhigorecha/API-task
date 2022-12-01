package com.abhishek.airmeet.apitask.model;

import com.abhishek.airmeet.apitask.entity.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersModel {

        @NotBlank(message = "First Name should not be blank")
        private String firstName;

        @NotBlank(message = "Last Name should not be blank")
        private String lastName;

        @NotBlank(message = "Account Number should not be blank")
        private String accountNumber;

        @Email(message = "Please enter a valid email")
        private String email;

        public UsersModel(Users users) {
                this(
                        users.getFirstName(),
                        users.getLastName(),
                        users.getAccountNumber(),
                        users.getEmail(),
                        users.getBirthDate()
                );
        }

        private LocalDate birthDate;
}
