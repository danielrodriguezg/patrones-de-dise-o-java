package com.danielrodriguezg.domain.pokemon;

import com.danielrodriguezg.domain.pokemon.charmander.factory.CharmanderFactory;
import com.danielrodriguezg.domain.pokemon.pikachu.factory.PikachuFactory;

public class GenericPokemonFactory implements IPokemonFactory<IPokemon>{
    private String name;

    public GenericPokemonFactory(String name){
        this.name = name;
    }

    @Override
    public IPokemon createPokemon() {
        switch (name.toUpperCase()) {
            case "CHARMANDER":
                return new CharmanderFactory().createPokemon();
            case "PIKACHU":
                return new PikachuFactory().createPokemon();
            default:
                System.out.println(name+" no se encuentra en el sistema");
                return null;
        }
    }
    
}
