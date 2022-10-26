package com.danielrodriguezg.domain.pokemon.charmander;

import com.danielrodriguezg.domain.pokemon.IPokemon;

public class Charmander implements IPokemon{

    @Override
    public String name() {
        return "Charmander";
    }

    @Override
    public String tipo() {
        return "Fuego";
    }
    
}
