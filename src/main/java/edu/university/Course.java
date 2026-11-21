package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Course implements Identified {
    private final String code;
    private final String name;
    private final int hours;

    public Course(String code, String name, int hours) {
        this.code = code;
        this.name = name;
        this.hours = hours;
    }

    @Override
    public boolean matches(String code) {
        return this.code.equals(code);
    }

    @Override
    public String render() {
        return this.name + " [" + this.code + "] — " + this.hours + " ч/нед";
    }
}
