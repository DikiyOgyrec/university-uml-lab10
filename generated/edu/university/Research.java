package edu.university;

import java.util.List;

public final class Research implements Scholar {
	private final Employee person;
	private final String field;
	private final java.util.Vector<Institute> institutes;
	private final Engagement workload;

	public Research(Employee person, String field, java.util.List<Institute> institutes, Engagement workload) {
		throw new UnsupportedOperationException();
	}

	public boolean matches(String code) {
		throw new UnsupportedOperationException();
	}

	public Scholar participate(Project project, int hours) {
		throw new UnsupportedOperationException();
	}

	public Scholar teach(Course course) {
		throw new UnsupportedOperationException();
	}

	public boolean contains(String code) {
		throw new UnsupportedOperationException();
	}

	public String render() {
		throw new UnsupportedOperationException();
	}
}