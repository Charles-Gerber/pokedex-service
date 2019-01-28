package com.egencia.code.academy.pokedexservice.model;

import java.util.List;

public class Pokemon {
    int id;
    String name;
    List<String> types;
    int nbLikes;

    public Pokemon(int id, String name, List <String> types, int nbLikes) {
        this.id = id;
        this.name = name;
        this.types = types;
        this.nbLikes = nbLikes;
    }


}
