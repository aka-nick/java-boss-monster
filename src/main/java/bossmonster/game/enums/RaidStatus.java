package bossmonster.game.enums;

public enum RaidStatus {

    START("""
               ^-^
             / 0 0 \\
            (   "   )
             \\  -  /
              - ^ -
            """),
    PROGRESS("""
               ^-^
             / x x \\
            (   "\\  )
             \\  ^  /
              - ^ -
            """),
    END_VICTORY("""
               ^-^
             / x x \\
            (   "\\  )
             \\  ^  /
              - ^ -
            """),
    END_DEFEAT("""
               ^-^
             / ^ ^ \\
            (   "   )
             \\  3  /
              - ^ -
            """),
    ;

    final String bossFigure;

    RaidStatus(String bossFigure) {
        this.bossFigure = bossFigure;
    }

    public String bossFigure() {
        return bossFigure;
    }

}
