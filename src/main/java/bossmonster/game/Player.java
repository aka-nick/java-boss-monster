package bossmonster.game;

import bossmonster.game.dto.PlayerName;
import bossmonster.game.dto.PlayerStatus;

public class Player {

    private String name;
    private Integer hp;
    private Integer mp;

    public void writeName(PlayerName playerName) {
        name = playerName.get();
    }

    public void initStatus(PlayerStatus playerStatus) {
        hp = playerStatus.getHP();
        mp = playerStatus.getMP();
    }
}
