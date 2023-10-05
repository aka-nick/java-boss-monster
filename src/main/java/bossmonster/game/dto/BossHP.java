package bossmonster.game.dto;

public class BossHP {

    private final Integer hp;

    private BossHP(String inputHP) {
        hp = Integer.parseInt(inputHP);
    }

    public static BossHP make(String inputHP) {
        // TODO : 유효성 검증 로직 추가할 것
        return new BossHP(inputHP);
    }

    public Integer get() {
        return hp;
    }
}
