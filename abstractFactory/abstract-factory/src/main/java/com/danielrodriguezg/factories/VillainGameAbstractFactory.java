package com.danielrodriguezg.factories;

import java.util.List;

import com.danielrodriguezg.domain.characters.ICharacter;
import com.danielrodriguezg.domain.characters.villain.factory.VillainFactory;
import com.danielrodriguezg.domain.pokemon.IPokemon;
import com.danielrodriguezg.domain.pokemon.charmander.factory.CharmanderFactory;

public class VillainGameAbstractFactory implements IAbstractFactoryPersonaje{

    @Override
    public ICharacter createCharacter() {
        return new VillainFactory().createCharacter();
    }

    @Override
    public List<IPokemon> createPokemon() {
        return List.of(new CharmanderFactory().createPokemon());
    }
    
}
