package bossmonster.game.view.GameView;

import bossmonster.game.GameMessage;
import bossmonster.game.dto.PlayerName;
import bossmonster.game.dto.PlayerStatus;
import bossmonster.io.Input;
import bossmonster.io.Output;
import bossmonster.game.dto.BossHP;

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
}
