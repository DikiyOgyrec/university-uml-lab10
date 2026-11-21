package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

final class ProjectTest {

    @Test
    void renders_the_project_schedule() {
        String name = "Исследование Ω-" + UUID.randomUUID();
        assertThat("The object failed to preserve the requested domain behavior",
            new Project(name, LocalDate.of(2026, 2, 3), LocalDate.of(2027, 4, 5)).render(),
            containsString(name + " [2026-02-03 — 2027-04-05]"));
    }
}
