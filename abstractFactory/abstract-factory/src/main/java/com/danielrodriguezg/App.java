package com.danielrodriguezg;

import java.util.List;
import java.util.stream.Collectors;

import com.danielrodriguezg.domain.characters.ICharacter;
import com.danielrodriguezg.domain.pokemon.IPokemon;
import com.danielrodriguezg.factories.IAbstractFactoryPersonaje;
import com.danielrodriguezg.factories.ProtagonistGameAbstractFactory;
import com.danielrodriguezg.factories.VillainGameAbstractFactory;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * En este caso uso Factories creadas especificamente para los objetos que quiero crear
     */
    public static void main(String[] args) {
        IAbstractFactoryPersonaje factoryVillano = new VillainGameAbstractFactory();
        ICharacter personaje1 = factoryVillano.createCharacter();
        List<IPokemon> pokemonsPersonaje1 = factoryVillano.createPokemon();

        IAbstractFactoryPersonaje factoryProta = new ProtagonistGameAbstractFactory();
        ICharacter personaje2 = factoryProta.createCharacter();
        List<IPokemon> pokemonsPersonaje2 = factoryProta.createPokemon();
        
        System.out.println("--------------------------------------");
        System.out.print("El personaje 1 es "+ personaje1.rol());
        System.out.print(", se llama "+ personaje1.nombre());
        System.out.println(" y sus pokemones son "+ pokemonsPersonaje1.stream().map(item -> item.name()+"["+item.tipo()+"]").collect(Collectors.joining(", ")));
        System.out.println("--------------------------------------");
        System.out.print("El personaje 2 es "+ personaje2.rol());
        System.out.print(", se llama "+ personaje2.nombre());
        System.out.println(" y sus pokemones son "+ pokemonsPersonaje2.stream().map(item -> item.name()+"["+item.tipo()+"]").collect(Collectors.joining(", ")));
        System.out.println("--------------------------------------");

    }
}
