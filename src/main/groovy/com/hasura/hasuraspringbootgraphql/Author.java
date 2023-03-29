package com.hasura.hasuraspringbootgraphql;

import com.fasterxml.jackson.annotation.JsonValue;

public record Author(Integer id, String firstName, String lastName) {

    public String fullName() {
        return firstName + " " + lastName;
    }

}


