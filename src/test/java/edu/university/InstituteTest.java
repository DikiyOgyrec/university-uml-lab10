package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Verifies the observable behavior of Institute.
 * <p>Run with {@code mvn test}.</p>
 */
final class InstituteTest {
    /**
     * Verifies that the object renders the institute address.
     */
    @Test
    void renders_the_institute_address() {
        String address = "Улица Ёлочная-" + UUID.randomUUID();
        assertThat("The object failed to preserve the requested domain behavior",
            new Institute("Кафедра Ω", address).render(),
            containsString(address));
    }
}
