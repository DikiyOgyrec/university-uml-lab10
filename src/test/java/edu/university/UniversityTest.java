package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

final class UniversityTest {

    @Test
    void reports_the_number_of_scientific_employees() {
        String name = "Университет Ё-" + UUID.randomUUID();
        assertThat("The object failed to preserve the requested domain behavior",
            new University(name, List.of(new Faculty("ФКН", new Person("demo-1", "Алёна Ё", "demo@example.invalid"), List.of(new Institute("Кафедра Ω", "Адрес Ω")))), List.of(new Research(new Person("demo-1", "Алёна Ё", "demo@example.invalid"), "ИИ", List.of(new Institute("Кафедра Ω", "Адрес Ω")), new Workload(List.of(), List.of())))).render(),
            containsString("Научных сотрудников: 1"));
    }
}
