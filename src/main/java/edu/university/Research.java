package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Represents an immutable research in the university information system.
 * <p>Use {@code value.render()} to display the domain description.</p>
 */
public final class Research implements Scholar {
    private final Employee person;
    private final String field;
    private final List<Institute> institutes;
    private final Engagement workload;

    /**
     * Creates an immutable research from the supplied domain values.
     */
    public Research(Employee person, String field, List<Institute> institutes, Engagement workload) {
        this.person = person;
        this.field = field;
        this.institutes = List.copyOf(institutes);
        this.workload = workload;
    }

    /**
     * Implements the matches operation of the Scholar role.
     */
    @Override
    public boolean matches(String code) {
        return this.person.matches(code);
    }

    /**
     * Implements the participate operation of the Scholar role.
     */
    @Override
    public Scholar participate(Project project, int hours) {
        return new Research(this.person, this.field, this.institutes, this.workload.participate(project, hours));
    }

    /**
     * Implements the teach operation of the Scholar role.
     */
    @Override
    public Scholar teach(Course course) {
        return new Research(this.person, this.field, this.institutes, this.workload.teach(course));
    }

    /**
     * Implements the contains operation of the Scholar role.
     */
    @Override
    public boolean contains(String code) {
        return this.workload.contains(code);
    }

    /**
     * Implements the render operation of the Scholar role.
     */
    @Override
    public String render() {
        return this.person.render() + "\nОбласть: " + this.field
            + "\nКафедры: " + this.institutes.stream().map(Institute::render).collect(Collectors.joining("; "))
            + "\n" + this.workload.render();
    }
}
