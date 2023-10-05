package bossmonster.game;

import bossmonster.config.Dependency;
import bossmonster.game.view.GameView.GameView;

public class Game {

    public void play() {
        GameView gameView = Dependency.gameView();
        Boss boss = Dependency.boss();
    }

}
