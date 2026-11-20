package edu.university;

/**
 * Defines the identified role in the university domain.
 * <p>Use implementations through this interface.</p>
 */
public interface Identified extends Printable {
    /** Checks whether the supplied code identifies this course. */
    boolean matches(String code);
}
