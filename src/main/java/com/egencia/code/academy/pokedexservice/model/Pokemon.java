package com.egencia.code.academy.pokedexservice.model;

import java.util.List;

public class Pokemon {

    private Long id;
    private String name;
    private List<String> types;
    private Integer likes;

    public Pokemon(Long id, String name, List<String> types, Integer likes) {
        this.id = id;
        this.name = name;
        this.types = types;
        this.likes = likes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
