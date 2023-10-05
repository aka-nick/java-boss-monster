package bossmonster.game;

public enum GameMessage {

    ASK_BOSS_HP("보스 몬스터의 HP를 입력해주세요."),
    ASK_PLAYER_NAME("플레이어의 이름을 입력해주세요."),
    ASK_PLAYER_STATUS("플레이어의 HP와 MP를 입력해주세요.(,로 구분)"),
    ANNOUNCE_BOSS_RAID("보스 레이드를 시작합니다!"),
    ;

    final String message;

    GameMessage(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }

}
