package edu.university;

public interface Campus extends Printable {

    Campus participate(String code, Project project, int hours);

    Campus teach(String code, Course course);

    boolean contains(String code);
}
