package edu.university;

import java.util.List;

/**
 * Represents an immutable research in the university information system.
 * <p>Use {@code value.render()} to display the domain description.</p>
 */
public final class Research implements Scholar {
	private final Employee person;
	private final String field;
	private final java.util.Vector<Institute> institutes;
	private final Engagement workload;

	/**
	 * Creates an immutable research from the supplied domain values.
	 */
	public Research(Employee person, String field, java.util.List<Institute> institutes, Engagement workload) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements the matches operation of the Scholar role.
	 */
	public boolean matches(String code) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements the participate operation of the Scholar role.
	 */
	public Scholar participate(Project project, int hours) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements the teach operation of the Scholar role.
	 */
	public Scholar teach(Course course) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements the contains operation of the Scholar role.
	 */
	public boolean contains(String code) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements the render operation of the Scholar role.
	 */
	public String render() {
		throw new UnsupportedOperationException();
	}
}