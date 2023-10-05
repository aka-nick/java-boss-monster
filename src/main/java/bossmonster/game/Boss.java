package bossmonster.game;

import bossmonster.game.dto.BossHP;

public class Boss {

    public static Integer hp;

    public void setStatus(BossHP bossHP) {
        hp = bossHP.getHPAmount();
    }

}
