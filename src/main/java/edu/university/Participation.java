package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Participation implements Printable {
    private final Project project;
    private final int hours;

    public Participation(Project project, int hours) {
        this.project = project;
        this.hours = hours;
    }

    @Override
    public String render() {
        return this.project.render() + " — " + this.hours + " ч всего";
    }
}
