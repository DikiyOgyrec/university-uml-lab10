package edu.university;

/**
 * Defines the scholar role in the university domain.
 * <p>Use implementations through this interface.</p>
 */
public interface Scholar extends Employee {
    /** Returns the scientist with another project participation. */
    Scholar participate(Project project, int hours);
    /** Returns the scientist with another teaching assignment. */
    Scholar teach(Course course);
    /** Checks whether this scientist teaches the identified course. */
    boolean contains(String code);
}
