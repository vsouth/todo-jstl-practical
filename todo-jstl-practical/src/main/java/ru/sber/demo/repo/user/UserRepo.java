package ru.sber.demo.repo.user;

import ru.sber.demo.model.user.User;

import java.util.List;
import java.util.Optional;

public interface UserRepo {
    List<User> findAll();

    Optional<User> findByLogin(String login);
    Optional<User> findById(Integer id);
    Integer getNextId();

    boolean create(User user);
}
