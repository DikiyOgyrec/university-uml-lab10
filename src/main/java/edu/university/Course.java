package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Represents an immutable course in the university information system.
 * <p>Use {@code value.render()} to display the domain description.</p>
 */
public final class Course implements Identified {
    private final String code;
    private final String name;
    private final int hours;

    /**
     * Creates an immutable course from the supplied domain values.
     */
    public Course(String code, String name, int hours) {
        this.code = code;
        this.name = name;
        this.hours = hours;
    }

    /**
     * Implements the matches operation of the Identified role.
     */
    @Override
    public boolean matches(String code) {
        return this.code.equals(code);
    }

    /**
     * Implements the render operation of the Identified role.
     */
    @Override
    public String render() {
        return this.name + " [" + this.code + "] — " + this.hours + " ч/нед";
    }
}
