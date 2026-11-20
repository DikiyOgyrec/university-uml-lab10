package edu.university;

/**
 * Represents an immutable participation in the university information system.
 * <p>Use {@code value.render()} to display the domain description.</p>
 */
public final class Participation implements Printable {
	private final Project project;
	private final int hours;

	/**
	 * Creates an immutable participation from the supplied domain values.
	 */
	public Participation(Project project, int hours) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements the render operation of the Printable role.
	 */
	public String render() {
		throw new UnsupportedOperationException();
	}
}