package com.arditzubaku.person;

import static com.arditzubaku.utils.StringUtils.isEmpty;

public class PersonService {
    public int addPerson(Person person) {
/*        if (person.getFirstName().isBlank()) {
            throw new IllegalArgumentException(
                    "First name cannot be null or empty"
            );
        }*/

        if (/*StringUtils.isEmpty(person.getFirstName())*/
        isEmpty(person.getFirstName())) {
            throw new IllegalArgumentException(
                    "First name cannot be null or empty"
            );
        }
        return 1;
    }
}
