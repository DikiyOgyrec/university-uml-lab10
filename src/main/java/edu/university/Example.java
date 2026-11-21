package edu.university;

import java.util.List;

public final class Example implements Scenario {
    private final String name;

    public Example(String name) {
        this.name = name;
    }

    @Override
    public Campus university() {
        Institute institute = new Institute("Кафедра программирования", "Учебный корпус Ω, кабинет 12");
        Employee dean = new Person("DEMO-001", "Алёна Ёлкина", "dean@example.invalid");
        return new University(this.name,
            List.of(new Faculty("Компьютерные науки", dean, List.of(institute))),
            List.of(
                new Research(dean, "Моделирование систем", List.of(institute),
                    new Workload(List.of(), List.of())),
                new Research(new Person("DEMO-002", "Лев Сёмин", "science@example.invalid"),
                    "Искусственный интеллект", List.of(institute), new Workload(List.of(), List.of()))
            )
        );
    }
}
