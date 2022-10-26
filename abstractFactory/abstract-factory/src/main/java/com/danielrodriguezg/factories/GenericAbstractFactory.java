package com.danielrodriguezg.factories;

import java.util.List;

import com.danielrodriguezg.domain.characters.GenericCharacterFactory;
import com.danielrodriguezg.domain.characters.ICharacter;
import com.danielrodriguezg.domain.pokemon.GenericPokemonFactory;
import com.danielrodriguezg.domain.pokemon.IPokemon;

public class GenericAbstractFactory implements IAbstractFactoryPersonaje{
    private String pokemon, personaje;

    public GenericAbstractFactory(String pokemon, String personaje){
        this.pokemon = pokemon;
        this.personaje = personaje;
    }
    @Override
    public ICharacter createCharacter() {
        return new GenericCharacterFactory(personaje).createCharacter();
    }

    @Override
    public List<IPokemon> createPokemon() {
        return List.of(new GenericPokemonFactory(pokemon).createPokemon());
    }
    
}
