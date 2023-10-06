package bossmonster.game.dto;

public class PlayerAttackMethod {

    private String inputMethod;

    private PlayerAttackMethod(String inputMethod) {
        this.inputMethod = inputMethod;
    }

    public static PlayerAttackMethod make(String inputMethod) {
        // TODO : 입력값에 대한 유효성 검증 로직 필요
        return new PlayerAttackMethod(inputMethod);
    }

    public String get() {
        return inputMethod;
    }
}
