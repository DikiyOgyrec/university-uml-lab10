package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Verifies the observable behavior of Research.
 * <p>Run with {@code mvn test}.</p>
 */
final class ResearchTest {
    /**
     * Verifies that the object retains the scientific research area.
     */
    @Test
    void retains_the_scientific_research_area() {
        String field = "Физика Ω-" + UUID.randomUUID();
        assertThat("The object failed to preserve the requested domain behavior",
            new Research(new Person("demo-" + UUID.randomUUID(), "Алёна Ё", "demo@example.invalid"), field, List.of(new Institute("Физика", "Адрес Ω")), new Workload(List.of(), List.of())).render(),
            containsString(field));
    }

    /**
     * Verifies that the object identifies an employee by the social code.
     */
    @Test
    void identifies_an_employee_by_the_social_code() {
        String code = "demo-" + UUID.randomUUID();
        assertThat("The object failed to preserve the requested domain behavior",
            new Research(new Person(code, "Алёна Ё", "demo@example.invalid"), "Физика", List.of(new Institute("Физика", "Адрес Ω")), new Workload(List.of(), List.of())).matches(code),
            is(true));
    }
}
