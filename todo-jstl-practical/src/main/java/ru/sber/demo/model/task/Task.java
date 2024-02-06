package ru.sber.demo.model.task;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task {
    private int id;
    private String title;
    // Это поле в общем списке не выводить!
    private String description;
    private boolean completed;
    private Priority priority;
}
