package com.danielrodriguezg.domain.pokemon;

public interface IPokemonFactory<T> {
    public T createPokemon();
}
