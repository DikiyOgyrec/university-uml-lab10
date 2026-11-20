package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Represents an immutable participation in the university information system.
 * <p>Use {@code value.render()} to display the domain description.</p>
 */
public final class Participation implements Printable {
    private final Project project;
    private final int hours;

    /**
     * Creates an immutable participation from the supplied domain values.
     */
    public Participation(Project project, int hours) {
        this.project = project;
        this.hours = hours;
    }

    /**
     * Implements the render operation of the Printable role.
     */
    @Override
    public String render() {
        return this.project.render() + " — " + this.hours + " ч всего";
    }
}
