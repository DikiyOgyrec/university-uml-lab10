package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Person implements Employee {
    private final String code;
    private final String name;
    private final String email;

    public Person(String code, String name, String email) {
        this.code = code;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean matches(String code) {
        return this.code.equals(code);
    }

    @Override
    public String render() {
        return this.name + " [" + this.code + "] <" + this.email + ">";
    }
}
