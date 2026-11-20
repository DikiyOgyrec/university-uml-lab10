package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Represents an immutable workload in the university information system.
 * <p>Use {@code value.render()} to display the domain description.</p>
 */
public final class Workload implements Engagement {
    private final List<Participation> projects;
    private final List<Course> courses;

    /**
     * Creates an immutable workload from the supplied domain values.
     */
    public Workload(List<Participation> projects, List<Course> courses) {
        this.projects = List.copyOf(projects);
        this.courses = List.copyOf(courses);
    }

    /**
     * Implements the participate operation of the Engagement role.
     */
    @Override
    public Engagement participate(Project project, int hours) {
        return new Workload(
            Stream.concat(this.projects.stream(), Stream.of(new Participation(project, hours))).toList(),
            this.courses
        );
    }

    /**
     * Implements the teach operation of the Engagement role.
     */
    @Override
    public Engagement teach(Course course) {
        return new Workload(
            this.projects,
            Stream.concat(this.courses.stream(), Stream.of(course)).toList()
        );
    }

    /**
     * Implements the contains operation of the Engagement role.
     */
    @Override
    public boolean contains(String code) {
        return this.courses.stream().anyMatch(course -> course.matches(code));
    }

    /**
     * Implements the render operation of the Engagement role.
     */
    @Override
    public String render() {
        return "Проекты: " + (this.projects.isEmpty() ? "нет" : this.projects.stream()
            .map(Participation::render).collect(Collectors.joining("; ")))
            + "\nКурсы: " + (this.courses.isEmpty() ? "нет" : this.courses.stream()
            .map(Course::render).collect(Collectors.joining("; ")));
    }
}
