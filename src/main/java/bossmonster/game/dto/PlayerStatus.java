package bossmonster.game.dto;

public class PlayerStatus {

    private final Integer hp;
    private final Integer mp;

    private PlayerStatus(Integer hp, Integer mp) {
        this.hp = hp;
        this.mp = mp;
    }

    public static PlayerStatus make(String inputStatus) {
        // TODO : 입력한 스테이터스 값에 대한 유효성 로직 추가 필요
        String[] splitStatus = inputStatus.split(",");
        return new PlayerStatus(
                Integer.parseInt(splitStatus[0]),
                Integer.parseInt(splitStatus[1]));
    }

    public Integer getHP() {
        return hp;
    }

    public Integer getMP() {
        return mp;
    }
}
