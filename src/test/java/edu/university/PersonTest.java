package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Verifies the observable behavior of Person.
 * <p>Run with {@code mvn test}.</p>
 */
final class PersonTest {
    /**
     * Verifies that the object renders the scientific employees identity.
     */
    @Test
    void renders_the_scientific_employees_identity() {
        String name = "Алёна-" + UUID.randomUUID();
        assertThat("The object failed to preserve the requested domain behavior",
            new Person("demo-" + UUID.randomUUID(), name, "demo@example.invalid").render(),
            containsString(name));
    }
}
