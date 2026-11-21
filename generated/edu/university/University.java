package edu.university;

import java.util.List;

public final class University implements Campus {
	private final String name;
	private final java.util.Vector<Faculty> faculties;
	private final java.util.Vector<Scholar> employees;

	public University(String name, java.util.List<Faculty> faculties, java.util.List<Scholar> employees) {
		throw new UnsupportedOperationException();
	}

	public Campus participate(String code, Project project, int hours) {
		throw new UnsupportedOperationException();
	}

	public Campus teach(String code, Course course) {
		throw new UnsupportedOperationException();
	}

	public boolean contains(String code) {
		throw new UnsupportedOperationException();
	}

	public String render() {
		throw new UnsupportedOperationException();
	}
}