package edu.university;

import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 * Runs the university console using caller-owned input and output streams.
 * <p>Use {@code new Console(reader, writer, session).run()} with UTF-8 streams.</p>
 */
public final class Console {
	private final BufferedReader input;
	private final PrintWriter output;
	private final Session session;

	/**
	 * Assigns the streams and initial session without taking resource ownership.
	 */
	public Console(BufferedReader input, PrintWriter output, Session session) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Executes commands until stop or end of input, failing immediately on invalid input.
	 */
	public void run() {
		throw new UnsupportedOperationException();
	}
}