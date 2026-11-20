package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Represents an immutable institute in the university information system.
 * <p>Use {@code value.render()} to display the domain description.</p>
 */
public final class Institute implements Printable {
    private final String name;
    private final String address;

    /**
     * Creates an immutable institute from the supplied domain values.
     */
    public Institute(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Implements the render operation of the Printable role.
     */
    @Override
    public String render() {
        return this.name + " — " + this.address;
    }
}
