package edu.university;

/**
 * Defines the engagement role in the university domain.
 * <p>Use implementations through this interface.</p>
 */
public interface Engagement extends Printable {

	/**
	 * Returns the workload with another project participation.
	 */
	public Engagement participate(Project project, int hours);

	/**
	 * Returns the workload with another teaching assignment.
	 */
	public Engagement teach(Course course);

	/**
	 * Checks whether a course identifier is already assigned.
	 */
	public boolean contains(String code);
}