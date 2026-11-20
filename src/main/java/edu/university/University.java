package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Represents an immutable university in the university information system.
 * <p>Use {@code value.render()} to display the domain description.</p>
 */
public final class University implements Campus {
    private final String name;
    private final List<Faculty> faculties;
    private final List<Scholar> employees;

    /**
     * Creates an immutable university from the supplied domain values.
     */
    public University(String name, List<Faculty> faculties, List<Scholar> employees) {
        this.name = name;
        this.faculties = List.copyOf(faculties);
        this.employees = List.copyOf(employees);
    }

    /**
     * Implements the participate operation of the Campus role.
     */
    @Override
    public Campus participate(String code, Project project, int hours) {
        if (this.employees.stream().noneMatch(employee -> employee.matches(code))) {
            throw new IllegalArgumentException("Unknown scientific employee [code=" + code + "]");
        }
        return new University(this.name, this.faculties, this.employees.stream()
            .map(employee -> employee.matches(code) ? employee.participate(project, hours) : employee).toList());
    }

    /**
     * Implements the teach operation of the Campus role.
     */
    @Override
    public Campus teach(String code, Course course) {
        if (this.employees.stream().noneMatch(employee -> employee.matches(code))) {
            throw new IllegalArgumentException("Unknown scientific employee [code=" + code + "]");
        }
        return new University(this.name, this.faculties, this.employees.stream()
            .map(employee -> employee.matches(code) ? employee.teach(course) : employee).toList());
    }

    /**
     * Implements the contains operation of the Campus role.
     */
    @Override
    public boolean contains(String code) {
        return this.employees.stream().anyMatch(employee -> employee.contains(code));
    }

    /**
     * Implements the render operation of the Campus role.
     */
    @Override
    public String render() {
        return this.name + "\nНаучных сотрудников: " + this.employees.size() + "\n"
            + this.faculties.stream().map(Faculty::render).collect(Collectors.joining("\n"))
            + "\n--- Научно-педагогический состав ---\n"
            + this.employees.stream().map(Scholar::render).collect(Collectors.joining("\n\n"));
    }
}
