package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Verifies the observable behavior of Participation.
 * <p>Run with {@code mvn test}.</p>
 */
final class ParticipationTest {
    /**
     * Verifies that the object renders the hours allocated to a project.
     */
    @Test
    void renders_the_hours_allocated_to_a_project() {
        int hours = ThreadLocalRandom.current().nextInt(1, 150);
        assertThat("The object failed to preserve the requested domain behavior",
            new Participation(new Project("Проект Ё-" + UUID.randomUUID(), LocalDate.of(2026, 1, 1), LocalDate.of(2027, 1, 1)), hours).render(),
            containsString(hours + " ч всего"));
    }
}
