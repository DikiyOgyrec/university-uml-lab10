package edu.university;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

/**
 * Verifies console output as the application's user-visible result.
 * <p>Run with {@code mvn test}; no system streams are replaced.</p>
 */
final class ConsoleTest {
    /** Verifies that show writes the current university to the supplied output. */
    @Test
    void displays_the_university_requested_by_the_user() throws Exception {
        String name = "Университет Ё-" + UUID.randomUUID();
        String result;
        try (
            BufferedReader input = new BufferedReader(new StringReader("show\nstop\n"));
            StringWriter buffer = new StringWriter();
            PrintWriter output = new PrintWriter(buffer)
        ) {
            new Console(input, output, new Session(new Example(name).university())).run();
            result = buffer.toString();
        }
        assertThat("The console omitted the requested university", result, containsString(name));
    }
}
