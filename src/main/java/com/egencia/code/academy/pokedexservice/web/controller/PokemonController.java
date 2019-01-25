package com.egencia.code.academy.pokedexservice.web.controller;

import com.egencia.code.academy.pokedexservice.model.Pokemon;
import com.egencia.code.academy.pokedexservice.model.PokemonDetail;
import com.egencia.code.academy.pokedexservice.model.PokemonsResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@RequestMapping(value = "pokedex-service/v1", produces = APPLICATION_JSON_VALUE + ";charset=utf-8")
public class PokemonController {

    @ResponseBody
    @RequestMapping(value="pokemons", method = RequestMethod.GET)
    public List<Pokemon> getPokemons(){
        System.out.println("getPokemons");
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1L,"Bulbasaur", Arrays.asList("poison", "grass"), 0));
        pokemons.add(new Pokemon(2L,"Ivysaur", Arrays.asList("air"), 1));
        PokemonsResponse pokemonsResponse = new PokemonsResponse();
        pokemonsResponse.setPokemons(pokemons);
        return pokemons;
    }

    @ResponseBody
    @RequestMapping(value="pokemons/{pokemonId:.*}", method = RequestMethod.GET)
    public PokemonDetail getPokemon(@PathVariable("pokemonId") String pokemonId) {
        System.out.println("getPokemon");
        PokemonDetail pokemonDetail = new PokemonDetail(1L,"Bulbasaur", Arrays.asList("poison", "grass"), 0);
        pokemonDetail.setImage("https://www.pokebip.com/pokedex-images/artworks/1.png");
        pokemonDetail.setDescription("blbablalba");
        pokemonDetail.setWeight(1.2);
        pokemonDetail.setHeight(34.5);
        return pokemonDetail;
    }
}
