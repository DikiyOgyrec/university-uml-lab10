package edu.university;

/**
 * Interprets commands for the scientific employee DEMO-002.
 * <p>Use {@code session.execute("course|CS-1|UML|4").render()} to assign a course.</p>
 */
public final class Session implements Interaction {
	private final Campus university;

	/**
	 * Creates an interaction with an immutable university snapshot.
	 */
	public Session(Campus university) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Executes a command after validating the external text input.
	 */
	public Session execute(String command) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Renders the current university snapshot.
	 */
	public String render() {
		throw new UnsupportedOperationException();
	}
}