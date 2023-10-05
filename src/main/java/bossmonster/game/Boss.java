package bossmonster.game;

public class Boss {

    public static Integer hp;

    public void setHP(String bossHP) {
        // TODO : 입력된 체력값에 대한 유효성 검증 필요
        hp = Integer.parseInt(bossHP);
    }

}
