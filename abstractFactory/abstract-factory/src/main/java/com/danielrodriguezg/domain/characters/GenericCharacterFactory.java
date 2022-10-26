package com.danielrodriguezg.domain.characters;

import com.danielrodriguezg.domain.characters.protagonist.factory.ProtagonistFactory;
import com.danielrodriguezg.domain.characters.villain.factory.VillainFactory;

public class GenericCharacterFactory implements ICharacterFactory<ICharacter>{
    private String nombre;

    public GenericCharacterFactory(String nombre){
        this.nombre = nombre;
    }

    @Override
    public ICharacter createCharacter() {
        switch (nombre.toUpperCase()) {
            case "ASH":    
                return new ProtagonistFactory().createCharacter();        
            case "GARY":
                return new VillainFactory().createCharacter();
            default:
                System.out.println(nombre+" no se encuentra en el sistema");
                return null;
        }
    }
    
}
