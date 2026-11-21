package edu.university;

public interface Scholar extends Employee {

    Scholar participate(Project project, int hours);

    Scholar teach(Course course);

    boolean contains(String code);
}
