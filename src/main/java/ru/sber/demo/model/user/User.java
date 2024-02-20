package ru.sber.demo.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String login;
    private String password;
    private LocalDate birthday;
    private Role role;
}
