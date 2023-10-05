package bossmonster.config;

import static java.util.Objects.*;

import bossmonster.game.Game;
import java.util.Objects;

public class Dependency {

    public static Game game;

    public static Game game() {
        if (isNull(game)) {
            game = new Game();
        }
        return game;
    }

}
