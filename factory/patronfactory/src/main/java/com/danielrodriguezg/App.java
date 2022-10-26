package com.danielrodriguezg;

import com.danielrodriguezg.domain.blastoise.factory.BlastoiseFactory;
import com.danielrodriguezg.domain.game.Game;
import com.danielrodriguezg.domain.pikachu.factory.PikachuFactory;
import com.danielrodriguezg.domain.vaporeon.factory.VaporeonFactory;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        System.out.println("--------------");
        Game game = new Game(new PikachuFactory());
        game.jugar();
        System.out.println("--------------");
        game = new Game(new BlastoiseFactory());
        game.jugar();
        System.out.println("--------------");
        game = new Game(new VaporeonFactory());
        game.jugar();
        System.out.println("--------------");
    }
}
