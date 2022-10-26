package com.danielrodriguezg.domain.pikachu.factory;

import com.danielrodriguezg.domain.IPokemon;
import com.danielrodriguezg.domain.IPokemonFactory;
import com.danielrodriguezg.domain.pikachu.Pikachu;

public class PikachuFactory implements IPokemonFactory{

    @Override
    public IPokemon crearPokemon() {
        return new Pikachu();
    }

}