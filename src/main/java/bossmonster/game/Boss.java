package bossmonster.game;

import bossmonster.game.dto.BossHP;

public class Boss {

    public static Integer hp;

    public void initHP(BossHP bossHP) {
        hp = bossHP.get();
    }

}
