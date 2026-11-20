package edu.university;

import java.util.List;

/**
 * Represents an immutable university in the university information system.
 * <p>Use {@code value.render()} to display the domain description.</p>
 */
public final class University implements Campus {
	private final String name;
	private final java.util.Vector<Faculty> faculties;
	private final java.util.Vector<Scholar> employees;

	/**
	 * Creates an immutable university from the supplied domain values.
	 */
	public University(String name, java.util.List<Faculty> faculties, java.util.List<Scholar> employees) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements the participate operation of the Campus role.
	 */
	public Campus participate(String code, Project project, int hours) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements the teach operation of the Campus role.
	 */
	public Campus teach(String code, Course course) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements the contains operation of the Campus role.
	 */
	public boolean contains(String code) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements the render operation of the Campus role.
	 */
	public String render() {
		throw new UnsupportedOperationException();
	}
}