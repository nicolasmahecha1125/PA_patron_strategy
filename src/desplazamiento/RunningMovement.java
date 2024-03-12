package desplazamiento;

import interfaces.Movement;

public class RunningMovement implements Movement {
    @Override
    public void move() {
        System.out.println("!corriendo");
    }
}
