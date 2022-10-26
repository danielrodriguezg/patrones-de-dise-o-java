package com.danielrodriguezg.factories;

import java.util.List;

import com.danielrodriguezg.domain.characters.ICharacter;
import com.danielrodriguezg.domain.pokemon.IPokemon;

public interface IAbstractFactoryPersonaje {
    public ICharacter createCharacter();
    public List<IPokemon> createPokemon();
}
