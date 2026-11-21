package edu.university;

import java.util.List;

public final class Faculty implements Printable {
	private final String name;
	private final Employee dean;
	private final java.util.Vector<Institute> institutes;

	public Faculty(String name, Employee dean, java.util.List<Institute> institutes) {
		throw new UnsupportedOperationException();
	}

	public String render() {
		throw new UnsupportedOperationException();
	}
}