package com.danielrodriguezg.domain.builder;

import com.danielrodriguezg.domain.vehicle.components.Engine;

public class EngineBuilder {
    private Engine engine;
    
    public EngineBuilder(){
        this.engine = new Engine();
    }

    public EngineBuilder setType(String type){
        this.engine.setType(type);
        return this;
    }

    public EngineBuilder setPistons(Integer pistons){
        this.engine.setPistons(pistons);
        return this;
    }

    public EngineBuilder setVolume(Double liters){
        this.engine.setVolume(liters);
        return this;
    }

    public Engine build(){
        return this.engine;
    }
}
