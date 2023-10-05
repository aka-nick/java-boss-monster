package bossmonster.game;

public enum GameMessage {

    ASK_BOSS_HP("보스 몬스터의 HP를 입력해주세요."),
    ASK_PLAYER_NAME("플레이어의 이름을 입력해주세요.");

    final String message;

    GameMessage(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }

}
