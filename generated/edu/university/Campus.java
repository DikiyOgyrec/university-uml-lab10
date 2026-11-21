package edu.university;

public interface Campus extends Printable {

	public Campus participate(String code, Project project, int hours);

	public Campus teach(String code, Course course);

	public boolean contains(String code);
}