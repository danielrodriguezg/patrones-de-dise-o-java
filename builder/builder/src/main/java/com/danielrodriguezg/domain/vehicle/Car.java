package com.danielrodriguezg.domain.vehicle;

import com.danielrodriguezg.domain.vehicle.components.*;

public class Car extends Vehicle{
    public Transmission transmission;

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Carro " +vehicleType.toString()+ " marca "+brand+" "+model+" motor "+engine.toString()+" transmision "+transmission.toString()+ " modelo "+year;
    } 
}
