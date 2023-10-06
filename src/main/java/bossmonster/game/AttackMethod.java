package bossmonster.game;

import bossmonster.value.AttackDetails;
import java.util.Arrays;
import java.util.function.Supplier;

public enum AttackMethod {

    PHYSICAL_ATTACK(1, "물리 공격", () -> new AttackDetails(10, 10)),
    MAGIC_ATTACK(2, "마법 공격", () -> new AttackDetails(20, -30)),
    ;

    final int methodNumber;
    final String methodName;
    final Supplier<AttackDetails> attackDetails;

    AttackMethod(int methodNumber, String methodName, Supplier<AttackDetails> attackDetails) {
        this.methodNumber = methodNumber;
        this.methodName = methodName;
        this.attackDetails = attackDetails;
    }

    public static AttackMethod select(String inputMethod) {
        // TODO : 입력된 inputMethod에 대한 유효성 검증 로직 필요
        return Arrays.stream(AttackMethod.values())
                .filter(method -> method.methodNumber == Integer.parseInt(inputMethod))
                .findAny()
                .orElseThrow(() ->
                        new IllegalArgumentException(ErrorMessage.WRONG_ATTACK_METHOD.message));
    }

    public String methodName() {
        return methodName;
    }
    public AttackDetails attackDetails() {
        return this.attackDetails.get();
    }

}
