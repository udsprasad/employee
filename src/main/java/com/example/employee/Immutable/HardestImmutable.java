package com.example.employee.Immutable;

import com.example.employee.models.Address;
import com.example.employee.models.Grade;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class HardestImmutable {

    private final String name;

    private final int age;

    private final Map<String, List<Grade>> courses;

    private final Address address;

    public HardestImmutable(String name, int age, Map<String, List<Grade>> courses, Address address) {
        this.name = name;
        this.age = age;
        this.courses =courses.entrySet()
                .stream().collect(Collectors.toUnmodifiableMap(Map.Entry::getKey,
                        entry -> entry.getValue()
                                .stream()
                                .map(grade ->
                                        new Grade(grade.getSubject(), grade.getScore()))
                                . collect(Collectors.toUnmodifiableList())
                ));
        this.address = new Address(address.getStreet(), address.getCity(), address.getZip());
    }

    public Address getAddress() {
        return new Address(address.getStreet(), address.getCity(), address.getZip());
    }

    public Map<String, List<Grade>> getCourses() {
        return courses.entrySet()
                .stream().collect(Collectors.toUnmodifiableMap(Map.Entry::getKey,
                        entry -> entry.getValue()
                                .stream()
                                .map(grade ->
                                        new Grade(grade.getSubject(), grade.getScore()))
                                . collect(Collectors.toUnmodifiableList())
                ));
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
