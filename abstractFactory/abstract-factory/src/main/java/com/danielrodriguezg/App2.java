package com.danielrodriguezg;

import java.util.List;
import java.util.stream.Collectors;

import com.danielrodriguezg.domain.characters.ICharacter;
import com.danielrodriguezg.domain.pokemon.IPokemon;
import com.danielrodriguezg.factories.GenericAbstractFactory;
import com.danielrodriguezg.factories.IAbstractFactoryPersonaje;

/**
 * Hello world!
 */
public final class App2 {
    private App2() {
    }

    /**
     * En este caso se usa una factory a la que le puedo determinar por parametros 
     * que objeto quiero crear usando polimorfismo 
     * y sin tener en cuenta la abstraccion de los objetos que estoy creando
     */
    public static void main(String[] args) {
        IAbstractFactoryPersonaje factoryVillano = new GenericAbstractFactory("charmander", "gary");
        ICharacter personaje1 = factoryVillano.createCharacter();
        List<IPokemon> pokemonsPersonaje1 = factoryVillano.createPokemon();

        IAbstractFactoryPersonaje factoryProta = new GenericAbstractFactory("pikachu", "ash");
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
