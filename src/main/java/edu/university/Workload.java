package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Workload implements Engagement {
    private final List<Participation> projects;
    private final List<Course> courses;

    public Workload(List<Participation> projects, List<Course> courses) {
        this.projects = List.copyOf(projects);
        this.courses = List.copyOf(courses);
    }

    @Override
    public Engagement participate(Project project, int hours) {
        return new Workload(
            Stream.concat(this.projects.stream(), Stream.of(new Participation(project, hours))).toList(),
            this.courses
        );
    }

    @Override
    public Engagement teach(Course course) {
        return new Workload(
            this.projects,
            Stream.concat(this.courses.stream(), Stream.of(course)).toList()
        );
    }

    @Override
    public boolean contains(String code) {
        return this.courses.stream().anyMatch(course -> course.matches(code));
    }

    @Override
    public String render() {
        return "Проекты: " + (this.projects.isEmpty() ? "нет" : this.projects.stream()
            .map(Participation::render).collect(Collectors.joining("; ")))
            + "\nКурсы: " + (this.courses.isEmpty() ? "нет" : this.courses.stream()
            .map(Course::render).collect(Collectors.joining("; ")));
    }
}
