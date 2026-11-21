package edu.university;

public interface Engagement extends Printable {

	public Engagement participate(Project project, int hours);

	public Engagement teach(Course course);

	public boolean contains(String code);
}