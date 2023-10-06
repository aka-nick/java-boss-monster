package bossmonster.game;

import bossmonster.game.dto.BossHP;
import bossmonster.util.Randoms;
import bossmonster.value.AttackDetails;

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

    public void attacked(AttackDetails playersAttack) {
        nowHP -= playersAttack.getDamageAmount();
    }

    public AttackDetails getAttackDetails() {
        return new AttackDetails(Randoms.make(0, 20));
    }

    public boolean isDead() {
        return nowHP <= 0;
    }
}
