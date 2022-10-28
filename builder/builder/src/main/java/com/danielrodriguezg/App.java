package com.danielrodriguezg;

import com.danielrodriguezg.director.VehicleBuilderDirector;
import com.danielrodriguezg.domain.builder.EngineBuilder;
import com.danielrodriguezg.domain.vehicle.Vehicle;
import com.danielrodriguezg.domain.vehicle.VehicleType;
import com.danielrodriguezg.domain.vehicle.components.Transmission;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        VehicleBuilderDirector director = new VehicleBuilderDirector();
        Vehicle carroDeportivo = director.construirDeportivo();
        Vehicle motoDeportiva = director.construirMoto();
        Vehicle camioneta = director.construirCamioneta();
        Vehicle motoScooter = director.construirMotoPersonalizada(
            "Yamaha", 
            "Bws", 
            new EngineBuilder()
                .setPistons(1)
                .setType("4 tiempos")
                .setVolume(0.125)
            .build(), 
            VehicleType.SCOOTER, "2023");
        Vehicle carroCompacto = director.construirCarroPersonalizado(
                "Chevrolet", 
                "Spark GT", 
                new EngineBuilder()
                    .setPistons(4)
                    .setType("En linea")
                    .setVolume(1.1)
                .build(),
                VehicleType.COMPACT,
                new Transmission("5", "Manual"),
                 "2023");

        System.out.println(carroDeportivo.toString());
        System.out.println(motoDeportiva.toString());
        System.out.println(camioneta.toString());
        System.out.println(motoScooter.toString());
        System.out.println(carroCompacto.toString());
    }
}
