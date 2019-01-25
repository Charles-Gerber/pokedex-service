package com.egencia.code.academy.pokedexservice.controller;

import com.egencia.code.academy.pokedexservice.model.Pokemon;
import com.egencia.code.academy.pokedexservice.model.PokemonDetail;
import com.egencia.code.academy.pokedexservice.service.PokemonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@RequestMapping(value = "pokedex-service/v1", produces = APPLICATION_JSON_VALUE + ";charset=utf-8")
public class PokemonController {

    @Autowired
    private PokemonsService pokemonsService;

    @ResponseBody
    @RequestMapping(value="pokemons", method = RequestMethod.GET)
    public List<Pokemon> getPokemons(){
        System.out.println("getPokemons");
        return pokemonsService.getAll();
    }

    @ResponseBody
    @RequestMapping(value="pokemons/{pokemonId:.*}", method = RequestMethod.GET)
    public PokemonDetail getPokemon(@PathVariable("pokemonId") Integer pokemonId) {
        System.out.println("getPokemon(" + pokemonId + ")");
        return pokemonsService.getDetail(pokemonId);
    }
}
