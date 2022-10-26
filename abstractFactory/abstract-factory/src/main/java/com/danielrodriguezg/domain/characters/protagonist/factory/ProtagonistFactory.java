package com.danielrodriguezg.domain.characters.protagonist.factory;

import com.danielrodriguezg.domain.characters.ICharacterFactory;
import com.danielrodriguezg.domain.characters.protagonist.Protagonist;

public class ProtagonistFactory implements ICharacterFactory<Protagonist>{

    @Override
    public Protagonist createCharacter() {
        return new Protagonist();
    }
    
}
