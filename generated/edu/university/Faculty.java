package edu.university;

import java.util.List;

/**
 * Represents an immutable faculty in the university information system.
 * <p>Use {@code value.render()} to display the domain description.</p>
 */
public final class Faculty implements Printable {
	private final String name;
	private final Employee dean;
	private final java.util.Vector<Institute> institutes;

	/**
	 * Creates an immutable faculty from the supplied domain values.
	 */
	public Faculty(String name, Employee dean, java.util.List<Institute> institutes) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements the render operation of the Printable role.
	 */
	public String render() {
		throw new UnsupportedOperationException();
	}
}