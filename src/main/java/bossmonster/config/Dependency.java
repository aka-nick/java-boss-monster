package bossmonster.config;

import static java.util.Objects.isNull;

import bossmonster.game.Game;
import bossmonster.game.view.GameView.GameView;

public class Dependency {

    public static Game game;
    public static GameView gameView;

    public static Game game() {
        if (isNull(game)) {
            game = new Game();
        }
        return game;
    }

    public static GameView gameView() {
        if (isNull(gameView)) {
            gameView = new GameView();
        }
        return gameView;
    }

}
