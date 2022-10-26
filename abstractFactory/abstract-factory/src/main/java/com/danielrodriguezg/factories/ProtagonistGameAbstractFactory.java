package com.danielrodriguezg.factories;

import java.util.List;

import com.danielrodriguezg.domain.characters.ICharacter;
import com.danielrodriguezg.domain.characters.protagonist.factory.ProtagonistFactory;
import com.danielrodriguezg.domain.pokemon.IPokemon;
import com.danielrodriguezg.domain.pokemon.charmander.factory.CharmanderFactory;
import com.danielrodriguezg.domain.pokemon.pikachu.factory.PikachuFactory;

public class ProtagonistGameAbstractFactory implements IAbstractFactoryPersonaje{

    @Override
    public ICharacter createCharacter() {
        return new ProtagonistFactory().createCharacter();
    }

    @Override
    public List<IPokemon> createPokemon() {
        return List.of(new PikachuFactory().createPokemon(), new CharmanderFactory().createPokemon());
    }
    
}
