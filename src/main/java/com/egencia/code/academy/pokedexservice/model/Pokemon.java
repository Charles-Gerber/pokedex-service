package com.egencia.code.academy.pokedexservice.model;

import java.util.List;

public class Pokemon {
    int id;
    String name;
    List<String> types;
    int likes;

    public Pokemon(int id, String name, List <String> types, int likes) {
        this.id = id;
        this.name = name;
        this.types = types;
        this.likes = likes;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getTypes() {
        return types;
    }

    public int getLikes() {
        return likes;
    }
}
