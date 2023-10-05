package bossmonster;

import bossmonster.config.Dependency;
import bossmonster.game.Game;

public class Main {

    public static void main(String[] args) {
        Game game = Dependency.game();
        game.play();
    }

}
