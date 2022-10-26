package com.danielrodriguezg.domain.characters.villain.factory;

import com.danielrodriguezg.domain.characters.ICharacterFactory;
import com.danielrodriguezg.domain.characters.villain.Villain;

public class VillainFactory implements ICharacterFactory<Villain>{

    @Override
    public Villain createCharacter() {
        return new Villain();
    }
    
}
