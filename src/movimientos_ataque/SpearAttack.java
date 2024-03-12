package movimientos_ataque;

import interfaces.Attackmove;

public class SpearAttack implements Attackmove {
    @Override
    public void Attack() {
        System.out.println("!Ataque de lanza");
    }
}
