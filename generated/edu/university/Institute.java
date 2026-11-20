package edu.university;

/**
 * Represents an immutable institute in the university information system.
 * <p>Use {@code value.render()} to display the domain description.</p>
 */
public final class Institute implements Printable {
	private final String name;
	private final String address;

	/**
	 * Creates an immutable institute from the supplied domain values.
	 */
	public Institute(String name, String address) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements the render operation of the Printable role.
	 */
	public String render() {
		throw new UnsupportedOperationException();
	}
}