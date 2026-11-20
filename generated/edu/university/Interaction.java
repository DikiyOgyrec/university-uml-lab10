package edu.university;

/**
 * Defines the interaction role in the university domain.
 * <p>Use implementations through this interface.</p>
 */
public interface Interaction extends Printable {

	/**
	 * Executes one console command and returns the next immutable session.
	 */
	public Session execute(String command);
}