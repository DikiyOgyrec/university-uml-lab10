package edu.university;

import java.time.LocalDate;

public final class Project implements Printable {
	private final String name;
	private final LocalDate start;
	private final LocalDate end;

	public Project(String name, LocalDate start, LocalDate end) {
		throw new UnsupportedOperationException();
	}

	public String render() {
		throw new UnsupportedOperationException();
	}
}