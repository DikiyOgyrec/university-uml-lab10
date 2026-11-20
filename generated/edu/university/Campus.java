package edu.university;

/**
 * Defines the campus role in the university domain.
 * <p>Use implementations through this interface.</p>
 */
public interface Campus extends Printable {

	/**
	 * Records project participation for the identified scientist.
	 */
	public Campus participate(String code, Project project, int hours);

	/**
	 * Assigns teaching to the identified scientist.
	 */
	public Campus teach(String code, Course course);

	/**
	 * Checks whether a course identifier is already used.
	 */
	public boolean contains(String code);
}