package bossmonster.game;

public enum RaidMessage {

    ASK_ATTACK_METHOD("어떤 공격을 하시겠습니까?" + System.lineSeparator() + "1. 물리 공격" + System.lineSeparator() + "2. 마법 공격"),
    ;

    final String message;

    RaidMessage(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }

}
