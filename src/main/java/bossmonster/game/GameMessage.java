package bossmonster.game;

public enum GameMessage {

    BOSS_HP_INPUT("보스 몬스터의 HP를 입력해주세요."),
    ;

    final String message;

    GameMessage(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }

}
