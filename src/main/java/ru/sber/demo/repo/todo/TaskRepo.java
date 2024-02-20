package ru.sber.demo.repo.todo;

import ru.sber.demo.model.task.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepo {
    List<Task> findAll();

    Optional<Task> findById(int id);
}
