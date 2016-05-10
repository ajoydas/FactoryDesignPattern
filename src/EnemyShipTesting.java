import java.util.Scanner;

/**
 * Created by ajoy on 5/10/16.
 */

public class EnemyShipTesting {
    public static void main(String[] args) {
        EnemyShip theEnemy = null;

        EnemyShip ufoShip = new UFOEnemyShip();

        System.out.print("\n");


        Scanner userInput = new Scanner(System.in);

        String enemyShipOption = "";

        System.out.print("What type of ship? (U or R)");

        while (userInput.hasNextLine()) {

            enemyShipOption = userInput.nextLine();


            if (enemyShipOption.equals("U")) {
                //System.out.println("Ufo");

                theEnemy = new UFOEnemyShip();
                theEnemy.displayEnemyShip();

            } else if (enemyShipOption.equals("R")) {

                theEnemy = new RocketEnemyShip();
                theEnemy.displayEnemyShip();

            } else {

                theEnemy = new BigUFOEnemyShip();
                theEnemy.displayEnemyShip();

            }
        }

    }
}
