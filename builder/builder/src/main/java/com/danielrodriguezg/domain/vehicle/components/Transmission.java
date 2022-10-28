package com.danielrodriguezg.domain.vehicle.components;

/**
 * Transmission
 */
public class Transmission {
    private String speeds;
    private String type;

    public Transmission(String speeds, String type){
        this.speeds = speeds;
        this.type = type;
    }
    
    @Override
    public String toString(){
        return String.format(" %s, %s velocidades", this.type, this.speeds);
    }
}