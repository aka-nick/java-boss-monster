package bossmonster.config;

import static java.util.Objects.isNull;

import bossmonster.game.Boss;
import bossmonster.game.Game;
import bossmonster.game.Player;
import bossmonster.game.view.GameView.GameView;

public class Dependency {

    public static Game game;
    public static GameView gameView;
    public static Boss boss;
    public static Player player;

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

    public static Boss boss() {
        if (isNull(boss)) {
            boss = new Boss();
        }
        return boss;
    }

    public static Player player() {
        if (isNull(player)) {
            player = new Player();
        }
        return player;
    }
}
