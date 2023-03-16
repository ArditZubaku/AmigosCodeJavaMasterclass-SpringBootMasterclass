package com.arditzubaku.person;

public class PersonService {
    public int addPerson(Person person) {
        if (person.getFirstName().isBlank()) {
            throw new IllegalArgumentException(
                    "First name cannot be null or empty"
            );
        }
        return 1;
    }
}
