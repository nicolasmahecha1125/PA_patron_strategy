package movimientos_defensivos;

import interfaces.DefensiveMove;

public class DefensiveEvasion implements DefensiveMove {
    @Override
    public void defending() {
        System.out.println("!Evasion de ataque");
    }
}
