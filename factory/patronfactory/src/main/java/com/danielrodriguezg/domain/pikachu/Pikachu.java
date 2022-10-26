package com.danielrodriguezg.domain.pikachu;

import com.danielrodriguezg.domain.IPokemon;

public class Pikachu implements IPokemon{
    
    @Override
    public void poder1() {
        System.out.println("impactrueno"); 
    }

    @Override
    public void poder2() {
        System.out.println("onda trueno"); 
    }

    @Override
    public void poder3() {
        System.out.println("rayo"); 
    }

    @Override
    public void poder4() {
        System.out.println("gruñido");         
    }

    @Override
    public String nombre() {
        return "Pikachu";
    }
    
}
