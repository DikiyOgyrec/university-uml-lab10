package edu.university;

public final class Person implements Employee {
	private final String code;
	private final String name;
	private final String email;

	public Person(String code, String name, String email) {
		throw new UnsupportedOperationException();
	}

	public boolean matches(String code) {
		throw new UnsupportedOperationException();
	}

	public String render() {
		throw new UnsupportedOperationException();
	}
}