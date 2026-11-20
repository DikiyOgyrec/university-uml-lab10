package edu.university;

/**
 * Defines the employee role in the university domain.
 * <p>Use implementations through this interface.</p>
 */
public interface Employee extends Printable {
    /** Checks whether the supplied code identifies this employee. */
    boolean matches(String code);
}
