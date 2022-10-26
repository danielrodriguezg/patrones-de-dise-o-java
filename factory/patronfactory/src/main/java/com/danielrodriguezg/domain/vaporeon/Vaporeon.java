package com.danielrodriguezg.domain.vaporeon;

import com.danielrodriguezg.domain.IPokemon;

public class Vaporeon implements IPokemon{

    @Override
    public void poder1() {
        System.out.println("latigo");         
    }

    @Override
    public void poder2() {
        System.out.println("placaje"); 
    }

    @Override
    public void poder3() {
        System.out.println("agua lodosa"); 
    }

    @Override
    public void poder4() {
        System.out.println("niebla"); 
    }

    @Override
    public String nombre() {
        return "Vaporeon";
    }
    
}
