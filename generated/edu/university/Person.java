package edu.university;

/**
 * Represents an immutable person in the university information system.
 * <p>Use {@code value.render()} to display the domain description.</p>
 */
public final class Person implements Employee {
	private final String code;
	private final String name;
	private final String email;

	/**
	 * Creates an immutable person from the supplied domain values.
	 */
	public Person(String code, String name, String email) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements the matches operation of the Employee role.
	 */
	public boolean matches(String code) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements the render operation of the Employee role.
	 */
	public String render() {
		throw new UnsupportedOperationException();
	}
}