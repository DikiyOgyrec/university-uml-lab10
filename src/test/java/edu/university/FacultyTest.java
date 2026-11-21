package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

final class FacultyTest {

    @Test
    void renders_the_faculty_and_its_dean() {
        String name = "Декан Ё-" + UUID.randomUUID();
        assertThat("The object failed to preserve the requested domain behavior",
            new Faculty("ФКН Ω", new Person("demo-" + UUID.randomUUID(), name, "demo@example.invalid"), List.of(new Institute("Кафедра Ω", "Адрес Ω"))).render(),
            containsString(name));
    }
}
