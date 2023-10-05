package bossmonster.game;

import bossmonster.config.Dependency;
import bossmonster.game.dto.BossHP;
import bossmonster.game.dto.PlayerName;
import bossmonster.game.dto.PlayerStatus;
import bossmonster.game.view.GameView.GameView;

public class Game {

    public void play() {
        //
        GameView gameView = Dependency.gameView();
        Boss boss = Dependency.boss();

        // 사용자로부터 보스몬스터의 HP양 입력받기
        initBossHP(gameView, boss);

        // 플레이어 생성
        Player player = Dependency.player();

        // 사용자로부터 플레이어의 이름 입력받기
        initPlayerName(gameView, player);

        // 사용자로부터 플레이어의 HP,MP 입력받기
        initPlayerStatus(gameView, player);

        // 보스레이드 시작하기
        startBossRaid(gameView, boss, player);
    }

    private static void initBossHP(GameView gameView, Boss boss) {
        BossHP bossHP = gameView.askBossHP();
        boss.initHP(bossHP);
    }

    private static void initPlayerName(GameView gameView, Player player) {
        PlayerName playerName = gameView.askPlayerName();
        player.writeName(playerName);
    }

    private static void initPlayerStatus(GameView gameView, Player player) {
        PlayerStatus playerStatus = gameView.askPlayerStatus();
        player.initStatus(playerStatus);
    }

    private void startBossRaid(GameView gameView, Boss boss, Player player) {
        // 레이드 시작 문구 출력하기
        gameView.announceStartRaid();
    }

}
