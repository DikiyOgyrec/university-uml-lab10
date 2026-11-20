package edu.university;

import java.util.List;

/**
 * Supplies fictional scientific staff for the laboratory demonstration.
 * <p>Use {@code new Example("University").university()} to start a session.</p>
 */
public final class Example implements Scenario {
    private final String name;

    /** Creates a scenario for the supplied university name. */
    public Example(String name) {
        this.name = name;
    }

    /** Creates a university with one faculty and two scientific employees. */
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
