package ru.sber.demo.model.task;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Priority {
    LOW("Низкий"), HIGH("Высокий"), UNKNOWN("Не задан");

    private final String value;
}
