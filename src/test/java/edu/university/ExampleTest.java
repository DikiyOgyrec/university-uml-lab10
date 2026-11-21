package edu.university;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

final class ExampleTest {

    @Test
    void prepares_a_university_with_the_requested_name() {
        String name = "Университет Ё-" + UUID.randomUUID();
        assertThat("The scenario ignored the supplied university name",
            new Example(name).university().render(), containsString(name));
    }
}
