import interfaces.Attackmove;
import interfaces.DefensiveMove;
import interfaces.Movement;

public class MilitaryUnit {
    private Attackmove attackmove;
    private Movement movement;
    private DefensiveMove defensiveMove;

    public MilitaryUnit(Attackmove attackmove, Movement movement, DefensiveMove defensiveMove) {
        this.attackmove = attackmove;
        this.movement = movement;
        this.defensiveMove = defensiveMove;
    }
    public void AttackBehavior(){
        attackmove.Attack();
    }
    public void MovementBehavior(){
        movement.move();
    }
    public void DefensiveBehavior(){
        defensiveMove.defending();
    }

}
