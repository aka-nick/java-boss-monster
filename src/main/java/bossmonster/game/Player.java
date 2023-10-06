package bossmonster.game;

import bossmonster.game.dto.PlayerName;
import bossmonster.game.dto.PlayerStatus;
import bossmonster.value.AttackDetails;

public class Player {

    private String name;
    private Integer maxHP;
    private Integer nowHP;
    private Integer maxMP;
    private Integer nowMP;

    public void writeName(PlayerName playerName) {
        name = playerName.get();
    }

    public void initStatus(PlayerStatus playerStatus) {
        maxHP = playerStatus.getHP();
        nowHP = maxHP;
        maxMP = playerStatus.getMP();
        nowMP = maxMP;
    }

    public boolean canAttack(AttackDetails attackDetails) {
        return 0 <= nowMP + attackDetails.getChangedMPAmount();
    }

    public String getName() {
        return name;
    }

    public int getMaxHP() {
        return maxHP.intValue();
    }

    public int getNowHP() {
        return nowHP.intValue();
    }

    public int getMaxMP() {
        return maxMP.intValue();
    }
    public int getNowMP() {
        return nowMP.intValue();
    }

    public void attack(AttackDetails playersAttack) {
        int changedMP = nowMP + playersAttack.getChangedMPAmount();

        if (changedMP < 0) {
            throw new IllegalArgumentException(ErrorMessage.NOT_ENOUGH_MANA.message);
        }
        if (maxMP < changedMP) {
            changedMP = maxMP;
        }

        nowMP = changedMP;
    }

    public void attacked(AttackDetails bossAttack) {
        nowHP -= bossAttack.getDamageAmount();
    }

    public boolean isDead() {
        return nowHP <= 0;
    }
}
