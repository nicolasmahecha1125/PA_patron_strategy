package movimientos_ataque;

import interfaces.Attackmove;

public class ArchAttack implements Attackmove {
    @Override
    public void Attack() {
        System.out.println("!ataque de arco");
    }
}
