package com.danielrodriguezg.domain.blastoise.factory;

import com.danielrodriguezg.domain.IPokemon;
import com.danielrodriguezg.domain.IPokemonFactory;
import com.danielrodriguezg.domain.blastoise.Blastoise;

public class BlastoiseFactory implements IPokemonFactory{

    @Override
    public IPokemon crearPokemon() {
        return new Blastoise();
    }
    
}
