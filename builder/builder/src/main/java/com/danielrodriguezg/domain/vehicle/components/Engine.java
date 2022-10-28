package com.danielrodriguezg.domain.vehicle.components;

public class Engine {
    private String type;
    private Integer pistons;
    private Double volume;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPistons() {
        return pistons;
    }

    public void setPistons(Integer pistons) {
        this.pistons = pistons;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return type + " " + pistons + " cilindros " + volume + " Litros";
    }

    
}
