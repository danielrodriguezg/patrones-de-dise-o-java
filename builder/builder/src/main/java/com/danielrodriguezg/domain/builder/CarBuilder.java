package com.danielrodriguezg.domain.builder;

import com.danielrodriguezg.domain.vehicle.Car;
import com.danielrodriguezg.domain.vehicle.VehicleType;
import com.danielrodriguezg.domain.vehicle.components.Engine;
import com.danielrodriguezg.domain.vehicle.components.Transmission;

public class CarBuilder implements IBuilder{
    private Car car;

    public CarBuilder(){
        this.car = new Car();
    }

    @Override
    public CarBuilder setEngine(Engine engine) {
        this.car.setEngine(engine);
        return this;        
    }

    @Override
    public CarBuilder setBrand(String brand) {
       this.car.setBrand(brand);
       return this;        
    }

    @Override
    public CarBuilder setModel(String model) {
       this.car.setModel(model);
       return this;        
    }

    @Override
    public CarBuilder setYear(String year) {
        this.car.setYear(year);
        return this;        
    }
    
    public CarBuilder setTransmission(Transmission transmission){
        this.car.setTransmission(transmission);
        return this;        
    }

    @Override
    public CarBuilder setVehicleType(VehicleType vehicleType) {
        this.car.setVehicleType(vehicleType);
        return this;        
    }

    public Car build(){
        return this.car;
    }
}
