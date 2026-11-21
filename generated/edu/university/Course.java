package edu.university;

public final class Course implements Identified {
	private final String code;
	private final String name;
	private final int hours;

	public Course(String code, String name, int hours) {
		throw new UnsupportedOperationException();
	}

	public boolean matches(String code) {
		throw new UnsupportedOperationException();
	}

	public String render() {
		throw new UnsupportedOperationException();
	}
}