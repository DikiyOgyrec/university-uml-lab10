package edu.university;

import java.util.List;

public final class Workload implements Engagement {
	private final java.util.Vector<Participation> projects;
	private final java.util.Vector<Course> courses;

	public Workload(java.util.List<Participation> projects, java.util.List<Course> courses) {
		throw new UnsupportedOperationException();
	}

	public Engagement participate(Project project, int hours) {
		throw new UnsupportedOperationException();
	}

	public Engagement teach(Course course) {
		throw new UnsupportedOperationException();
	}

	public boolean contains(String code) {
		throw new UnsupportedOperationException();
	}

	public String render() {
		throw new UnsupportedOperationException();
	}
}