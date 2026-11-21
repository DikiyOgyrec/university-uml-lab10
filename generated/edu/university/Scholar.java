package edu.university;

public interface Scholar extends Employee {

	public Scholar participate(Project project, int hours);

	public Scholar teach(Course course);

	public boolean contains(String code);
}