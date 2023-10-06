package bossmonster.game.view;

import bossmonster.game.dto.PlayerAttackMethod;
import bossmonster.game.enums.AttackMethod;
import bossmonster.game.enums.RaidMessage;
import bossmonster.game.enums.RaidStatus;
import bossmonster.game.enums.GameMessage;
import bossmonster.game.dto.PlayerName;
import bossmonster.game.dto.PlayerStatus;
import bossmonster.io.Input;
import bossmonster.io.Output;
import bossmonster.game.dto.BossHP;
import bossmonster.value.RaidField;

public class GameView {

    // TODO : 각 메서드는, 유효성 검증 실패 시 해당 동작을 재시도하도록 해야 함
    public BossHP askBossHP() {
        Output.println(GameMessage.ASK_BOSS_HP.message());
        return BossHP.make(Input.readLine());
    }

    public PlayerName askPlayerName() {
        Output.println(GameMessage.ASK_PLAYER_NAME.message());
        return PlayerName.make(Input.readLine());
    }

    public PlayerStatus askPlayerStatus() {
        Output.println(GameMessage.ASK_PLAYER_STATUS.message());
        return PlayerStatus.make(Input.readLine());
    }

    public void announceStartRaid() {
        Output.println(GameMessage.ANNOUNCE_BOSS_RAID.message());
    }

    public void draw(RaidField raidField, RaidStatus raidStatus) {
        String fieldStatus = """
                ============================
                BOSS HP [{bossNowHP}/{bossMaxHP}]
                ____________________________
                {bossFigure}
                ____________________________
                               
                {playerName} HP [{playerNowHP}/{playerMaxHP}] MP [{playerNowMP}/{playerMaxMP}]
                ============================
                """
                .replace("{bossNowHP}", String.valueOf(raidField.bossNowHP()))
                .replace("{bossMaxHP}", String.valueOf(raidField.bossMaxHP()))
                .replace("{bossFigure}", raidStatus.bossFigure())
                .replace("{playerName}", raidField.playerName())
                .replace("{playerNowHP}", String.valueOf(raidField.playerNowHp()))
                .replace("{playerMaxHP}", String.valueOf(raidField.playerMaxHP()))
                .replace("{playerNowMP}", String.valueOf(raidField.playerNowMP()))
                .replace("{playerMaxMP}", String.valueOf(raidField.playerMaxMP()));

        Output.println(fieldStatus);
    }

    public AttackMethod askPlayersAttack() {
        Output.println(RaidMessage.ASK_ATTACK_METHOD.message());
        PlayerAttackMethod playerAttackMethod = PlayerAttackMethod.make(Input.readLine());
        return AttackMethod.select(playerAttackMethod.get());
    }

    public void announceNowTurn(String nowTurnDetails) {
        Output.println(nowTurnDetails);
    }

    public void announceResult(String raidResultMessage) {
        Output.println(raidResultMessage);
    }
}
