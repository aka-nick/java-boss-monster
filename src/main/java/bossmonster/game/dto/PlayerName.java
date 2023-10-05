package bossmonster.game.dto;

public class PlayerName {

    private final String name;

    private PlayerName(String name) {
        this.name = name;
    }

    public static PlayerName make(String inputName) {
        // TODO : 이름 길이에 대한 유효성 검증로직 추가 필요
        return new PlayerName(inputName);
    }

    public String get() {
        return name;
    }
}
