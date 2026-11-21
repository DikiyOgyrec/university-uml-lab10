package edu.university;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

final class Application implements Runnable {
    private final String name;

    Application() {
        this.name = "Учебный университет Ω";
    }

    void main() {
        this.run();
    }

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
