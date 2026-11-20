package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Represents an immutable project in the university information system.
 * <p>Use {@code value.render()} to display the domain description.</p>
 */
public final class Project implements Printable {
    private final String name;
    private final LocalDate start;
    private final LocalDate end;

    /**
     * Creates an immutable project from the supplied domain values.
     */
    public Project(String name, LocalDate start, LocalDate end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    /**
     * Implements the render operation of the Printable role.
     */
    @Override
    public String render() {
        return this.name + " [" + this.start + " — " + this.end + "]";
    }
}
