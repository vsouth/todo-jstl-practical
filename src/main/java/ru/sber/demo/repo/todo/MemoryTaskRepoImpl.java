package ru.sber.demo.repo.todo;

import ru.sber.demo.model.task.Priority;
import ru.sber.demo.model.task.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class MemoryTaskRepoImpl implements TaskRepo {
    private final static List<Task> TASKS = new ArrayList<>();

    static {
        TASKS.add(new Task(1, "Eat", "",false, Priority.HIGH));
        TASKS.add(new Task(2, "Sleep", "",false, Priority.HIGH));
        TASKS.add(new Task(3, "Work", "",true, Priority.LOW));
        TASKS.add(new Task(4, "One more..", "",false, Priority.UNKNOWN));
    }

    @Override
    public List<Task> findAll() {
        return TASKS;
    }

    @Override
    public Optional<Task> findById(int id) {
        return TASKS.stream()
                .filter(item -> item.getId() == id)
                .findFirst();
    }
}
