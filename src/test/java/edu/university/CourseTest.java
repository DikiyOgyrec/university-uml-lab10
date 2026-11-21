package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

final class CourseTest {

    @Test
    void renders_the_courses_weekly_duration() {
        int hours = ThreadLocalRandom.current().nextInt(1, 15);
        assertThat("The object failed to preserve the requested domain behavior",
            new Course("курс-" + UUID.randomUUID(), "Моделирование Ω", hours).render(),
            containsString(hours + " ч/нед"));
    }
}
