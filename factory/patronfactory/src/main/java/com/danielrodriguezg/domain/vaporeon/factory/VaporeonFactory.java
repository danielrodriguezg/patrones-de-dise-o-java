package com.danielrodriguezg.domain.vaporeon.factory;

import com.danielrodriguezg.domain.IPokemon;
import com.danielrodriguezg.domain.IPokemonFactory;
import com.danielrodriguezg.domain.vaporeon.Vaporeon;

public class VaporeonFactory implements IPokemonFactory{

    @Override
    public IPokemon crearPokemon() {
        return new Vaporeon();
    }
    
}
