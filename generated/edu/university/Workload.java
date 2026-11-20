package edu.university;

import java.util.List;

/**
 * Represents an immutable workload in the university information system.
 * <p>Use {@code value.render()} to display the domain description.</p>
 */
public final class Workload implements Engagement {
	private final java.util.Vector<Participation> projects;
	private final java.util.Vector<Course> courses;

	/**
	 * Creates an immutable workload from the supplied domain values.
	 */
	public Workload(java.util.List<Participation> projects, java.util.List<Course> courses) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements the participate operation of the Engagement role.
	 */
	public Engagement participate(Project project, int hours) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements the teach operation of the Engagement role.
	 */
	public Engagement teach(Course course) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements the contains operation of the Engagement role.
	 */
	public boolean contains(String code) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Implements the render operation of the Engagement role.
	 */
	public String render() {
		throw new UnsupportedOperationException();
	}
}