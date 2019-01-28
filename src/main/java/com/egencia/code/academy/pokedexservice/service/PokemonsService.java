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
        // TODO : exercie 1 : retourner une liste de pokemon
        Pokemon pikachu = new Pokemon(1, "Pikachu", Arrays.asList("electricite", "jaune", "enervant"), 0);

        List pokemonList = new ArrayList<Pokemon>();
        pokemonList.add(pikachu);

        return pokemonList;
    }

    public PokemonDetail getDetail(Integer id) {
        // TODO : exercice 2 : retourner le détail d'un pokemon (il faut déjà le trouver dans la liste)
        return null;
    }
}
