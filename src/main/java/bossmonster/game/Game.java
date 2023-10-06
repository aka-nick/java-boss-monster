package bossmonster.game;

import bossmonster.config.Dependency;
import bossmonster.game.dto.BossHP;
import bossmonster.game.dto.PlayerName;
import bossmonster.game.dto.PlayerStatus;
import bossmonster.game.enums.AttackMethod;
import bossmonster.game.enums.RaidStatus;
import bossmonster.game.view.GameView;
import bossmonster.value.AttackDetails;
import bossmonster.value.RaidField;
import bossmonster.value.RaidTurnDetails;

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

        // 보스레이드 수행
        String raidResultMessage = runBossRaid(gameView, boss, player);

        // 결과 메시지 출력
        gameView.announceResult(raidResultMessage);
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

    private String runBossRaid(GameView gameView, Boss boss, Player player) {
        // 레이드 시작 문구 출력하기
        gameView.announceStartRaid();

        int numberOfRaidTurn = 0;
        RaidStatus raidStatus = RaidStatus.START;
        while (true) {
            // 공격 턴 수 기록
            numberOfRaidTurn++;

            // 게임화면 출력하기 (보스 정보, 보스 그림, 플레이어 정보)
            RaidField raidField = RaidField.make(boss, player);
            gameView.draw(raidField, raidStatus);

            RaidTurnDetails raidTurnDetails = new RaidTurnDetails();

            // 플레이어 공격
            AttackMethod playerAttackMethod = performPlayerAttack(gameView, player, boss);
            raidTurnDetails.addPlayerTurnDetails(playerAttackMethod);
            raidStatus = RaidStatus.PROGRESS;

            // 플레이어의 공격 결과 확인
            if (boss.isDead()) {
                raidStatus = RaidStatus.END_VICTORY;
                gameView.announceNowTurn(raidTurnDetails.message());
                break;
            }

            // 보스 공격
            AttackDetails bossAttackDetails = performBossAttack(boss, player);
            raidTurnDetails.addBossTurnDetails(bossAttackDetails);

            // 보스의 공격 결과 확인
            if (player.isDead()) {
                raidStatus = RaidStatus.END_DEFEAT;
                gameView.announceNowTurn(raidTurnDetails.message());
                break;
            }

            // 주고받은 결과를 출력
            gameView.announceNowTurn(raidTurnDetails.message());
        }

        return createRaidResultMessage(raidStatus, numberOfRaidTurn, player, boss, gameView);
    }

    private AttackMethod performPlayerAttack(GameView gameView, Player player, Boss boss) {
        AttackMethod playerAttackMethod = gameView.askPlayersAttack();
        player.attack(playerAttackMethod.attackDetails());
        boss.attacked(playerAttackMethod.attackDetails());
        return playerAttackMethod;
    }

    private AttackDetails performBossAttack(Boss boss, Player player) {
        AttackDetails bossAttack = boss.getAttackDetails();
        player.attacked(bossAttack);
        return bossAttack;
    }

    private String createRaidResultMessage(
            RaidStatus raidStatus,
            int numberOfRaidTurn,
            Player player,
            Boss boss,
            GameView gameView) {

        if (isVictory(raidStatus)) {
            return player.getName() + " 님이 " + numberOfRaidTurn + "번의 전투 끝에 보스 몬스터를 잡았습니다.";
        }
        RaidField raidField = RaidField.make(boss, player);
        gameView.draw(raidField, raidStatus);
        return player.getName() + "의 HP가 0이 되었습니다."
                + System.lineSeparator()
                + "보스 레이드에 실패했습니다.";
    }

    private static boolean isVictory(RaidStatus raidStatus) {
        return raidStatus == RaidStatus.END_VICTORY;
    }

}
