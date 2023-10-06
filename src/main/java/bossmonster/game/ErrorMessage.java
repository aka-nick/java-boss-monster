package bossmonster.game;

public enum ErrorMessage {
    WRONG_ATTACK_METHOD("공격하셔야 합니다. 1 또는 2를 입력해주세요."),
    NOT_ENOUGH_MANA("MP가 부족해서 마법 공격을 할 수 없습니다.");

    final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

}
