package com.danielrodriguezg.domain.characters.protagonist;

import com.danielrodriguezg.domain.characters.ICharacter;

public class Protagonist implements ICharacter{

    @Override
    public String nombre() {
        return "Gary";
    }

    @Override
    public String rol() {
        return "Villano";
    }
    
}
