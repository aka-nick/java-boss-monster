package bossmonster.game;

import bossmonster.game.dto.PlayerName;

public class Player {

    private String name;

    public void writeName(PlayerName playerName) {
        name = playerName.get();
    }

}
