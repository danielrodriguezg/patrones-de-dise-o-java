package com.danielrodriguezg.director;

import com.danielrodriguezg.domain.builder.CarBuilder;
import com.danielrodriguezg.domain.builder.EngineBuilder;
import com.danielrodriguezg.domain.builder.MotorBikeBuilder;
import com.danielrodriguezg.domain.vehicle.Car;
import com.danielrodriguezg.domain.vehicle.MotorBike;
import com.danielrodriguezg.domain.vehicle.VehicleType;
import com.danielrodriguezg.domain.vehicle.components.Engine;
import com.danielrodriguezg.domain.vehicle.components.Transmission;

public class VehicleBuilderDirector {
    public Car construirDeportivo(){
        CarBuilder builder = new CarBuilder();
        return builder.setBrand("Porsche")
            .setModel("911 GT3")
            .setEngine(new EngineBuilder()
                    .setType("Boxer")
                    .setPistons(6)
                    .setVolume(3.6)
                .build()
            ).setTransmission(new Transmission("7", "Manual"))
            .setVehicleType(VehicleType.SPORT)
            .setYear("2012")
        .build();
    }

    public Car construirCamioneta(){
        CarBuilder builder = new CarBuilder();
        return builder
            .setBrand("Toyota")
            .setModel("Land Cruiser")
            .setEngine(new EngineBuilder()
                    .setType("En linea")
                    .setPistons(6)
                    .setVolume(3.0)
                .build()
            ).setTransmission(new Transmission("6", "Automatica"))
            .setVehicleType(VehicleType.SUV)
            .setYear("2021")
        .build();
    }

    public MotorBike construirMoto(){
        return new MotorBikeBuilder()
            .setBrand("Yamaha")
            .setModel("R6")
            .setEngine(new EngineBuilder()
                    .setType("4 tiempos")
                    .setPistons(1)
                    .setVolume(0.599)
                .build()
            ).setVehicleType(VehicleType.SPORT)
            .setYear("2021")
        .build();
    }

    public Car construirCarroPersonalizado(String marca, String modelo, Engine motor, VehicleType tipo, Transmission transmision, String año){
        return new CarBuilder()
            .setBrand(marca)
            .setModel(modelo)
            .setEngine(motor)
            .setVehicleType(tipo)
            .setTransmission(transmision)
            .setYear(año)
        .build();
    }

    public MotorBike construirMotoPersonalizada(String marca, String modelo, Engine motor, VehicleType tipo, String año){
        return new MotorBikeBuilder()
            .setBrand(marca)
            .setModel(modelo)
            .setEngine(motor)
            .setVehicleType(tipo)
            .setYear(año)
        .build();
    }
}
