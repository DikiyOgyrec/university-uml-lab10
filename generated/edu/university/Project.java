package edu.university;

import java.time.LocalDate;

/**
 * Represents an immutable project in the university information system.
 * <p>Use {@code value.render()} to display the domain description.</p>
 */
public final class Project implements Printable {
	private final String name;
	private final LocalDate start;
	private final LocalDate end;

	/**
	 * Creates an immutable project from the supplied domain values.
	 */
	public Project(String name, LocalDate start, LocalDate end) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements the render operation of the Printable role.
	 */
	public String render() {
		throw new UnsupportedOperationException();
	}
}