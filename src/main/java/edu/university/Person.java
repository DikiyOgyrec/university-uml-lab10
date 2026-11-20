package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Represents an immutable person in the university information system.
 * <p>Use {@code value.render()} to display the domain description.</p>
 */
public final class Person implements Employee {
    private final String code;
    private final String name;
    private final String email;

    /**
     * Creates an immutable person from the supplied domain values.
     */
    public Person(String code, String name, String email) {
        this.code = code;
        this.name = name;
        this.email = email;
    }

    /**
     * Implements the matches operation of the Employee role.
     */
    @Override
    public boolean matches(String code) {
        return this.code.equals(code);
    }

    /**
     * Implements the render operation of the Employee role.
     */
    @Override
    public String render() {
        return this.name + " [" + this.code + "] <" + this.email + ">";
    }
}
