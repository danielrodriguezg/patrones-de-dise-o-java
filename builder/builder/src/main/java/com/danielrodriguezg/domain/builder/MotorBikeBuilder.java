package com.danielrodriguezg.domain.builder;

import com.danielrodriguezg.domain.vehicle.MotorBike;
import com.danielrodriguezg.domain.vehicle.VehicleType;
import com.danielrodriguezg.domain.vehicle.components.Engine;

public class MotorBikeBuilder implements IBuilder{
    private MotorBike bike;

    public MotorBikeBuilder(){
        this.bike = new MotorBike();
    }

    @Override
    public MotorBikeBuilder setEngine(Engine engine) {
        this.bike.setEngine(engine);
        return this;        
    }

    @Override
    public MotorBikeBuilder setBrand(String brand) {
        this.bike.setBrand(brand);
        return this;        
    }

    @Override
    public MotorBikeBuilder setModel(String model) {
        this.bike.setModel(model);
        return this;        
    }

    @Override
    public MotorBikeBuilder setYear(String year) {
        this.bike.setYear(year);
        return this;        
    }

    @Override
    public MotorBikeBuilder setVehicleType(VehicleType vehicleType) {
        this.bike.setVehicleType(vehicleType);
        return this;        
    }

    public MotorBike build(){
        return this.bike;
    }
}
