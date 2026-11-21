package edu.university;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UncheckedIOException;

public final class Console implements Runnable {
    private final BufferedReader input;
    private final PrintWriter output;
    private final Session session;

    public Console(BufferedReader input, PrintWriter output, Session session) {
        this.input = input;
        this.output = output;
        this.session = session;
    }

    @Override
    public void run() {
        Session current = this.session;
        this.output.println("Университетская информационная система — лабораторная 10");
        this.output.println("Данные вымышленные | Назначения для DEMO-002");
        this.output.println("show | project|название|YYYY-MM-DD|YYYY-MM-DD|часы | course|ID|название|часы | stop");
        this.output.flush();
        try {
            String command;
            while ((command = this.input.readLine()) != null && !command.equals("stop")) {
                current = current.execute(command);
                this.output.println(current.render());
                this.output.flush();
            }
        } catch (IOException exception) {
            throw new UncheckedIOException("Cannot read the university console input", exception);
        }
    }
}
