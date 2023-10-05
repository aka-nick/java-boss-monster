package bossmonster.game.view.GameView;

import bossmonster.game.GameMessage;
import bossmonster.io.Input;
import bossmonster.io.Output;
import bossmonster.game.dto.BossHP;

public class GameView {

    public BossHP askBossHP() {
        // TODO : 유효성 검증 실패 시 재시도하도록 해야 함
        Output.println(GameMessage.BOSS_HP_INPUT.message());
        return BossHP.make(Input.readLine());
    }

}
