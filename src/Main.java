import desplazamiento.RunningMovement;
import desplazamiento.WalkingMovement;
import movimientos_ataque.ArchAttack;
import movimientos_ataque.SpearAttack;
import movimientos_ataque.SwordAttack;
import movimientos_defensivos.DefensiveEvasion;
import movimientos_defensivos.ShieldDefense;

public class Main {
    public static void main(String[] args) {
        MilitaryUnit soldado = new MilitaryUnit(new SpearAttack(), new WalkingMovement(),new ShieldDefense());
        MilitaryUnit arquero = new MilitaryUnit(new ArchAttack(), new WalkingMovement(),new DefensiveEvasion());
        MilitaryUnit caballero = new MilitaryUnit(new SwordAttack(),new RunningMovement(),new ShieldDefense());


        System.out.println("--------------soldado--------------------------------------------" );
        soldado.AttackBehavior();
        soldado.DefensiveBehavior();
        soldado.MovementBehavior();

        System.out.println("--------------arquero---------------------------------------------" );
        arquero.MovementBehavior();
        arquero.DefensiveBehavior();
        arquero.AttackBehavior();

        System.out.println("--------------caballero--------------------------------------------" );
        caballero.MovementBehavior();
        caballero.AttackBehavior();
        caballero.DefensiveBehavior();
    }

}