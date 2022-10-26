package com.danielrodriguezg.domain.pokemon.pikachu;

import com.danielrodriguezg.domain.pokemon.IPokemon;

/**
 * Pikachu
 */
public class Pikachu implements IPokemon{

    @Override
    public String name() {
        return "Pikachu";
    }

    @Override
    public String tipo() {
        return "Electrico";
    }

    
}