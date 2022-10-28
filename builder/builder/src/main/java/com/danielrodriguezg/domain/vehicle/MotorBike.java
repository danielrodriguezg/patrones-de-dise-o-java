package com.danielrodriguezg.domain.vehicle;

public class MotorBike extends Vehicle{
    
    @Override
    public String toString() {
        return "Moto tipo "+vehicleType.toString()+" marca "+brand+" "+model+ " motor "+engine.toString()+ " modelo "+year;
    }
    
}
