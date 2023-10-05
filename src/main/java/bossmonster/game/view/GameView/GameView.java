package bossmonster.game.view.GameView;

import bossmonster.game.Boss;
import bossmonster.game.GameMessage;
import bossmonster.io.Input;
import bossmonster.io.Output;

public class GameView {

    public void askBossHP(Boss boss) {
        Output.println(GameMessage.BOSS_HP_INPUT.message());
        String bossHP = Input.readLine();
        boss.setHP(bossHP);
    }

}
