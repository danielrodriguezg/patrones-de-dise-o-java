package com.danielrodriguezg.domain.characters.villain;

import com.danielrodriguezg.domain.characters.ICharacter;

public class Villain implements ICharacter{

    @Override
    public String nombre() {
        return "Ash";
    }

    @Override
    public String rol() {
        return "Protagonista principal";
    }
    
}
