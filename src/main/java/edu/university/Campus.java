package edu.university;

/**
 * Defines the campus role in the university domain.
 * <p>Use implementations through this interface.</p>
 */
public interface Campus extends Printable {
    /** Records project participation for the identified scientist. */
    Campus participate(String code, Project project, int hours);
    /** Assigns teaching to the identified scientist. */
    Campus teach(String code, Course course);
    /** Checks whether a course identifier is already used. */
    boolean contains(String code);
}
