package desplazamiento;

import interfaces.Movement;

public class WalkingMovement implements Movement {
    @Override
    public void move() {
        System.out.println("!caminando");
    }
}
