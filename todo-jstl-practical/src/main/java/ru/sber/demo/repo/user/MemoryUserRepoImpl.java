package ru.sber.demo.repo.user;

import ru.sber.demo.model.user.Role;
import ru.sber.demo.model.user.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class MemoryUserRepoImpl implements UserRepo {
    private final static List<User> USERS = new ArrayList<>();

    static {
        USERS.add(new User(1, "qwe", "123", LocalDate.of(1993, 10, 13), Role.ADMIN));
        USERS.add(new User(2, "qwer", "123", LocalDate.of(2000, 3, 15), Role.USER));
        USERS.add(new User(2, "admin", "admin", LocalDate.of(2001, 1, 1), Role.ADMIN));
    }

    @Override
    public List<User> findAll() {
        return USERS;
    }

    @Override
    public boolean create(User user) {
        if (user == null) {
            return false;
        }
        return USERS.add(user);
    }

    @Override
    public Optional<User> findByLogin(String login) {
        return USERS.stream().filter(user -> user.getLogin().equals(login)).findFirst();
    }
}
