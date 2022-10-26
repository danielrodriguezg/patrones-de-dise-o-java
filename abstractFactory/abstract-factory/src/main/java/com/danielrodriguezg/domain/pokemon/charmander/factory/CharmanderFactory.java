package com.danielrodriguezg.domain.pokemon.charmander.factory;

import com.danielrodriguezg.domain.pokemon.IPokemonFactory;
import com.danielrodriguezg.domain.pokemon.charmander.Charmander;

public class CharmanderFactory implements IPokemonFactory<Charmander>{

    @Override
    public Charmander createPokemon() {
        return new Charmander();
    }
    
}
