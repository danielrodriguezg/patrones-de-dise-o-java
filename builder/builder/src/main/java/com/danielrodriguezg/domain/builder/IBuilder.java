package com.danielrodriguezg.domain.builder;

import com.danielrodriguezg.domain.vehicle.VehicleType;
import com.danielrodriguezg.domain.vehicle.components.*;

public interface IBuilder {
    public IBuilder setEngine(Engine engine);
    public IBuilder setBrand(String brand);
    public IBuilder setModel(String model);
    public IBuilder setYear(String year);
    public IBuilder setVehicleType(VehicleType vehicleType);
}
