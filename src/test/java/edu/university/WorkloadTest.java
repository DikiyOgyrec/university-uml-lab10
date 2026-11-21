package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

final class WorkloadTest {

    @Test
    void adds_a_course_without_mutating_the_original_workload() {
        Workload load = new Workload(List.of(), List.of());
        load.teach(new Course("курс-" + UUID.randomUUID(), "Сети Ω", 3));
        assertThat("The object failed to preserve the requested domain behavior",
            load.render(),
            equalTo("Проекты: нет\nКурсы: нет"));
    }

    @Test
    void retains_the_assigned_course() {
        String name = "Сети Ё-" + UUID.randomUUID();
        assertThat("The object failed to preserve the requested domain behavior",
            new Workload(List.of(), List.of()).teach(new Course("курс-" + UUID.randomUUID(), name, 5)).render(),
            containsString(name));
    }
}
