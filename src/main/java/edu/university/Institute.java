package edu.university;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Institute implements Printable {
    private final String name;
    private final String address;

    public Institute(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String render() {
        return this.name + " — " + this.address;
    }
}
