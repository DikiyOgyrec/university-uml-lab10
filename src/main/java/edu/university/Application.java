package edu.university;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * Starts the Java 25 application through an instance main method.
 * <p>Run {@code java -cp target/classes edu.university.Application}.</p>
 */
final class Application implements Runnable {
    private final String name;

    /** Assigns the demonstration university name. */
    Application() {
        this.name = "Учебный университет Ω";
    }

    /** Provides the Java 25 launcher entry point without a static method. */
    void main() {
        this.run();
    }

    /** Opens UTF-8 streams and closes the owned resources on exit. */
    @Override
    public void run() {
        try (
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
            PrintWriter output = new PrintWriter(System.out, true, StandardCharsets.UTF_8)
        ) {
            new Console(input, output, new Session(new Example(this.name).university())).run();
        } catch (java.io.IOException exception) {
            throw new java.io.UncheckedIOException("Cannot close the university console input", exception);
        }
    }
}
