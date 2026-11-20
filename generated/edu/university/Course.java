package edu.university;

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
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements the matches operation of the Identified role.
	 */
	public boolean matches(String code) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements the render operation of the Identified role.
	 */
	public String render() {
		throw new UnsupportedOperationException();
	}
}