package bossmonster.game;

import bossmonster.config.Dependency;
import bossmonster.game.dto.BossHP;
import bossmonster.game.view.GameView.GameView;

public class Game {

    public void play() {
        GameView gameView = Dependency.gameView();
        Boss boss = Dependency.boss();

        // 사용자로부터 보스몬스터의 HP양 입력받기
        setBossHP(gameView, boss);

        // 플레이어 생성
        Player player = Dependency.player();
    }

    private static void setBossHP(GameView gameView, Boss boss) {
        BossHP bossHP = gameView.askBossHP();
        boss.setStatus(bossHP);
    }

}
