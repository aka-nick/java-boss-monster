package bossmonster.value;

import java.util.Objects;

public class AttackDetails {

    private int damageAmount;
    private int changedMPAmount;

    public AttackDetails(int damageAmount) {
        this(damageAmount, 0);
    }

    public AttackDetails(int damageAmount, int changedMPAmount) {
        this.damageAmount = damageAmount;
        this.changedMPAmount = changedMPAmount;
    }

    public int getDamageAmount() {
        return damageAmount;
    }

    public int getChangedMPAmount() {
        return changedMPAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AttackDetails that = (AttackDetails) o;
        return damageAmount == that.damageAmount && changedMPAmount == that.changedMPAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(damageAmount, changedMPAmount);
    }

}
