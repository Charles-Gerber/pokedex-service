package com.egencia.code.academy.pokedexservice.service;

import com.egencia.code.academy.pokedexservice.model.Pokemon;
import com.egencia.code.academy.pokedexservice.model.PokemonDetail;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PokemonsService {

    public List<Pokemon> getAll() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1L,"Bulbasaur", Arrays.asList("poison", "grass"), 0));
        pokemons.add(new Pokemon(2L,"Ivysaur", Arrays.asList("air"), 1));
        return pokemons;
    }

    public PokemonDetail getDetail(Integer id) {
        PokemonDetail pokemonDetail = new PokemonDetail(1L,"Bulbasaur", Arrays.asList("poison", "grass"), 0);
        pokemonDetail.setImage("https://www.pokebip.com/pokedex-images/artworks/1.png");
        pokemonDetail.setDescription("blbablalba");
        pokemonDetail.setWeight(1.2);
        pokemonDetail.setHeight(34.5);
        return pokemonDetail;
    }
}
