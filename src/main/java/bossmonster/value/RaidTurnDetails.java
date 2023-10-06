package bossmonster.value;

import bossmonster.game.AttackMethod;
import java.util.Objects;

public class RaidTurnDetails {

    private AttackMethod playerAttackMethod;
    private AttackDetails bossAttackDetails;

    public void addPlayerTurnDetails(AttackMethod playerAttackMethod) {
        this.playerAttackMethod = playerAttackMethod;
    }

    public void addBossTurnDetails(AttackDetails bossAttackDetails) {
        this.bossAttackDetails = bossAttackDetails;
    }

    public String message() {
        String message = "";
        if (playerAttackMethod != null) {
            message += playerAttackMethod.methodName() + "을 했습니다. "
                    + "(입힌 데미지: " + playerAttackMethod.attackDetails().getDamageAmount() + ")"
                    + System.lineSeparator();
        }
        if (bossAttackDetails != null) {
            message += "보스가 공격 했습니다. (입힌 데미지: " + bossAttackDetails.getDamageAmount() + ")"
                    + System.lineSeparator();
        }
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RaidTurnDetails that = (RaidTurnDetails) o;
        return playerAttackMethod.equals(that.playerAttackMethod) &&
                Objects.equals(bossAttackDetails, that.bossAttackDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerAttackMethod, bossAttackDetails);
    }
}
