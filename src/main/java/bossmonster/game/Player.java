package bossmonster.game;

import bossmonster.game.dto.PlayerName;
import bossmonster.game.dto.PlayerStatus;

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

}
