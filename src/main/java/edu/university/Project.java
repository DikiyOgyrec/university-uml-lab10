package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Project implements Printable {
    private final String name;
    private final LocalDate start;
    private final LocalDate end;

    public Project(String name, LocalDate start, LocalDate end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    @Override
    public String render() {
        return this.name + " [" + this.start + " — " + this.end + "]";
    }
}
