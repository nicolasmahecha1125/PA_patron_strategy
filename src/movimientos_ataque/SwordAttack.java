package movimientos_ataque;

import interfaces.Attackmove;

public class SwordAttack implements Attackmove {

    @Override
    public void Attack() {
        System.out.println("!Ataque de espada");
    }
}
