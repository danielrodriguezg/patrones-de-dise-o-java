package com.danielrodriguezg.domain.blastoise;

import com.danielrodriguezg.domain.IPokemon;

public class Blastoise implements IPokemon{

    @Override
    public void poder1() {
        System.out.println("cañon");     
    }

    @Override
    public void poder2() {
        System.out.println("pistola agua");        
    }

    @Override
    public void poder3() {
        System.out.println("burbuja");    
    }

    @Override
    public void poder4() {
        System.out.println("hidro impulso"); 
    }

    @Override
    public String nombre() {
        return "Blastoise";
    }
    
}
