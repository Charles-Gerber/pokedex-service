package com.egencia.code.academy.pokedexservice.web.controller;

import com.egencia.code.academy.pokedexservice.model.Pokemon;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@RequestMapping(value = "/v1", produces = APPLICATION_JSON_VALUE + ";charset=utf-8")
public class PokemonController {

    @ResponseBody
    @RequestMapping(value="pokemons", method = RequestMethod.GET)
    public List<Pokemon> getPokemons(){
        return new ArrayList<>();
    }

}
