package bossmonster.game;

import bossmonster.game.dto.BossHP;

public class Boss {

    public Integer maxHP;
    public Integer nowHP;

    public void initHP(BossHP bossHP) {
        maxHP = bossHP.get();
        nowHP = maxHP;
    }

    public int getMaxHP() {
        return maxHP.intValue();
    }

    public int getNowHP() {
        return nowHP.intValue();
    }

}
