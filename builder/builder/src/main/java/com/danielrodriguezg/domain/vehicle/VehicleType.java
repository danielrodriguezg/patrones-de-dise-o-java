package com.danielrodriguezg.domain.vehicle;

public enum VehicleType {
    SPORT("Deportivo"),
    TOURING("Turismo"),
    SUV("Utilitario Deportivo"),
    COMPACT("Compacto"),
    ENDURO("Enduro"),
    UTILITARY("Utilitario"),
    SCOOTER("Scooter");
    
    private final String value;
    private VehicleType(String value){
        this.value = value;
    }

    public String toString(){
        return value;
    }
}
