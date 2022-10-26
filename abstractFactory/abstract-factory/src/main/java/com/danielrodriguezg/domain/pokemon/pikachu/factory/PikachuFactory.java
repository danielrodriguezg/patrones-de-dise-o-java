package com.danielrodriguezg.domain.pokemon.pikachu.factory;

import com.danielrodriguezg.domain.pokemon.IPokemonFactory;
import com.danielrodriguezg.domain.pokemon.pikachu.Pikachu;

/**
 * PikachuFactory
 */
public class PikachuFactory implements IPokemonFactory<Pikachu>{

    @Override
    public Pikachu createPokemon() {
        return new Pikachu();
    }

}