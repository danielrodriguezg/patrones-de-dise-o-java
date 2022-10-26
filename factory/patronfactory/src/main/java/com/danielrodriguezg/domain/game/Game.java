package com.danielrodriguezg.domain.game;

import com.danielrodriguezg.domain.IPokemon;
import com.danielrodriguezg.domain.IPokemonFactory;

public class Game {
    private IPokemonFactory factory;

    public Game(IPokemonFactory factory){
        this.factory = factory;
    }

    public void jugar(){
        IPokemon pokemon = factory.crearPokemon();
        System.out.println(pokemon.nombre()+" usa");
        pokemon.poder1();
        pokemon.poder2();
        pokemon.poder3();
        pokemon.poder4();
    }
}
