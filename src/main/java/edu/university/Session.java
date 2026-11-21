package edu.university;

import java.time.LocalDate;

public final class Session implements Interaction {
    private final Campus university;

    public Session(Campus university) {
        this.university = university;
    }

    @Override
    public Session execute(String command) {
        String[] parts = command.split("\\|", -1);
        if (command.equals("show")) {
            return this;
        }
        for (String part : parts) {
            if (part.isBlank()) {
                throw new IllegalArgumentException("Command contains an empty field [fields=" + parts.length + "]");
            }
        }
        if (parts[0].equals("project") && parts.length == 5) {
            LocalDate start = LocalDate.parse(parts[2]);
            LocalDate end = LocalDate.parse(parts[3]);
            int hours = Integer.parseInt(parts[4]);
            if (end.isBefore(start) || hours <= 0) {
                throw new IllegalArgumentException("Invalid project period or workload [start=" + start
                    + ", end=" + end + ", hours=" + hours + "]");
            }
            return new Session(this.university.participate("DEMO-002", new Project(parts[1], start, end), hours));
        }
        if (parts[0].equals("course") && parts.length == 4) {
            int hours = Integer.parseInt(parts[3]);
            if (hours <= 0 || this.university.contains(parts[1])) {
                throw new IllegalArgumentException("Invalid or duplicate course [hours=" + hours
                    + ", identifier_length=" + parts[1].length() + "]");
            }
            return new Session(this.university.teach("DEMO-002", new Course(parts[1], parts[2], hours)));
        }
        throw new IllegalArgumentException("Unsupported command [fields=" + parts.length + "]");
    }

    @Override
    public String render() {
        return this.university.render();
    }
}
