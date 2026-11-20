package edu.university;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Verifies user commands without requiring a network connection.
 * <p>Run with {@code mvn test}.</p>
 */
final class SessionTest {
    /** Verifies isolated results when the same immutable session is used concurrently. */
    @Test
    void isolates_concurrent_course_assignments() {
        Session session = new Session(new Example("Университет Ё-" + UUID.randomUUID()).university());
        String code = "курс-" + UUID.randomUUID();
        assertThat("Concurrent commands lost their individual teaching assignments",
            java.util.stream.IntStream.range(0, 24).parallel()
                .allMatch(index -> session.execute("course|" + code + index + "|Алгебра Ω|3")
                    .render().contains(code + index)), org.hamcrest.Matchers.is(true));
    }

    /**
     * Verifies that participation commands update the displayed scientific workload.
     */
    @Test
    void records_a_scientists_project_participation() {
        String name = "Проект Ё-" + UUID.randomUUID();
        assertThat("The session lost the recorded research project",
            new Session(new Example("Университет Ω").university())
                .execute("project|" + name + "|2026-01-01|2027-01-01|120")
                .render(), containsString(name));
    }

    /**
     * Verifies that course commands make the scientist a teaching employee.
     */
    @Test
    void assigns_a_course_to_a_scientist() {
        String name = "Курс Ё-" + UUID.randomUUID();
        assertThat("The session lost the assigned teaching course",
            new Session(new Example("Университет Ω").university())
                .execute("course|" + UUID.randomUUID() + "|" + name + "|4")
                .render(), containsString(name));
    }

    /**
     * Verifies that invalid project periods cannot enter the domain.
     */
    @Test
    void rejects_a_project_that_ends_before_it_begins() {
        String name = "Проект Ё-" + UUID.randomUUID();
        assertThrows(IllegalArgumentException.class,
            () -> new Session(new Example("Университет Ω").university())
                .execute("project|" + name + "|2027-01-01|2026-01-01|12"),
            "The session accepted a project with a reversed period");
    }

    /**
     * Verifies that a course identifier remains unique within the university.
     */
    @Test
    void rejects_a_duplicate_course_identifier() {
        String code = "курс-" + UUID.randomUUID();
        Session session = new Session(new Example("Университет Ω").university())
            .execute("course|" + code + "|Алгебра Ё|4");
        assertThrows(IllegalArgumentException.class,
            () -> session.execute("course|" + code + "|Геометрия Ω|5"),
            "The session accepted a duplicate course identifier");
    }

    /**
     * Verifies that project work requires a positive number of hours.
     */
    @Test
    void rejects_nonpositive_project_hours() {
        String name = "Проект Ё-" + UUID.randomUUID();
        assertThrows(IllegalArgumentException.class,
            () -> new Session(new Example("Университет Ω").university())
                .execute("project|" + name + "|2026-01-01|2027-01-01|0"),
            "The session accepted nonpositive project hours");
    }
}
