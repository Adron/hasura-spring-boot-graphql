package com.hasura.hasuraspringbootgraphql;

public record Book(Integer id, String title, Integer pages, Rating rating, Author author) {

}

