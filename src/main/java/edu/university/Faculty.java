package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Faculty implements Printable {
    private final String name;
    private final Employee dean;
    private final List<Institute> institutes;

    public Faculty(String name, Employee dean, List<Institute> institutes) {
        this.name = name;
        this.dean = dean;
        this.institutes = List.copyOf(institutes);
    }

    @Override
    public String render() {
        return "Факультет: " + this.name + "\nДекан: " + this.dean.render()
            + "\n" + this.institutes.stream().map(Institute::render).collect(Collectors.joining("\n"));
    }
}
