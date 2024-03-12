package movimientos_defensivos;

import interfaces.DefensiveMove;

public class ShieldDefense implements DefensiveMove {
    @Override
    public void defending() {
        System.out.println("!defensa de escudo");
    }
}
