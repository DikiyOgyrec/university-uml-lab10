package edu.university;

public interface Engagement extends Printable {

    Engagement participate(Project project, int hours);

    Engagement teach(Course course);

    boolean contains(String code);
}
