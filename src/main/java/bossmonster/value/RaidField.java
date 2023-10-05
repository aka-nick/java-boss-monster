package bossmonster.value;

import bossmonster.game.Boss;
import bossmonster.game.Player;
import java.util.Objects;

public class RaidField {

    private Integer bossMaxHP;
    private Integer bossNowHP;
    private String playerName;
    private Integer playerMaxHP;
    private Integer playerNowHP;
    private Integer playerMaxMP;
    private Integer playerNowMP;

    private RaidField(
            Integer bossMaxHP,
            Integer bossNowHP,
            String playerName,
            Integer playerMaxHP,
            Integer playerNowHP,
            Integer playerMaxMP,
            Integer playerNowMP) {
        this.bossMaxHP = bossMaxHP;
        this.bossNowHP = bossNowHP;
        this.playerName = playerName;
        this.playerMaxHP = playerMaxHP;
        this.playerNowHP = playerNowHP;
        this.playerMaxMP = playerMaxMP;
        this.playerNowMP = playerNowMP;
    }

    public static RaidField make(Boss boss, Player player) {
        return new RaidField(
                boss.getMaxHP(),
                boss.getNowHP(),
                player.getName(),
                player.getMaxHP(),
                player.getNowHP(),
                player.getMaxMP(),
                player.getNowMP());
    }

    public int bossMaxHP() {
        return bossMaxHP.intValue();
    }

    public int bossNowHP() {
        return bossNowHP.intValue();
    }

    public String playerName() {
        return playerName;
    }

    public int playerMaxHP() {
        return playerMaxHP.intValue();
    }

    public int playerNowHp() {
        return playerNowHP.intValue();
    }

    public int playerMaxMP() {
        return playerMaxMP.intValue();
    }

    public int playerNowMP() {
        return playerNowMP.intValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RaidField that = (RaidField) o;
        return bossMaxHP.equals(that.bossMaxHP) && bossNowHP.equals(that.bossNowHP)
                && playerMaxHP.equals(that.playerMaxHP) && playerNowHP.equals(that.playerNowHP)
                && playerMaxMP.equals(that.playerMaxMP) && playerNowMP.equals(that.playerNowMP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bossMaxHP, bossNowHP, playerMaxHP, playerNowHP, playerMaxMP,
                playerNowMP);
    }

}
