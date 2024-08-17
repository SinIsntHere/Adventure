import java.util.Scanner;

public class SiegeOfPike {
    static int health = 100; // Starting health
    static boolean hasOxygenTank = false;
    static boolean hasMedicine = false;

    public static void main(String[] args) {
        System.out.println("You wake up in a dimly lit bunker. The air is heavy, and you feel a sense of dread.");
        startGame();
    }

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        
        while (health > 0) {
            System.out.println("What do you want to do?");
            System.out.println("1. Search the bunker for supplies.");
            System.out.println("2. Check the oxygen tubes.");
            System.out.println("3. Examine the monitors.");
            
            int choice = scanner.nextInt();
            handleChoice(choice);
            
            if (!hasOxygenTank && !hasMedicine) {
                applyRadiationDamage();
            }
        }

        if (health <= 0) {
            System.out.println("You have succumbed to radiation poisoning. The world fades to black as you take your last breath...");
            System.out.println("Game Over. You died.");
            // Optionally, restart the game or exit
        }
    }

    public static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                searchSupplies();
                break;
            case 2:
                checkOxygenTubes();
                break;
            case 3:
                examineMonitors();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void searchSupplies() {
        System.out.println("You search the bunker and find a first aid kit. It might contain something useful...");
        System.out.println("Inside, you find a dose of radiation medicine!");
        hasMedicine = true;
    }

    public static void checkOxygenTubes() {
        System.out.println("You examine the oxygen tubes and realize you can carry the tank with you.");
        hasOxygenTank = true;
        System.out.println("You take the oxygen tank, feeling slightly safer.");
    }

    public static void examineMonitors() {
        System.out.println("The monitors flicker, showing brief glimpses of old news reports.");
        System.out.println("'...radiation levels... catastrophic...'");
        System.out.println("You start to piece together the horror that befell Pike.");
    }

    public static void applyRadiationDamage() {
        health -= 20;
        System.out.println("You feel a wave of nausea. The radiation is starting to take its toll. Health: " + health);

        if (health <= 80 && health > 60) {
            System.out.println("Your skin tingles, and you start to feel light-headed.");
        } else if (health <= 60 && health > 40) {
            System.out.println("Your vision blurs, and every breath feels labored.");
        } else if (health <= 40 && health > 20) {
            System.out.println("You can barely stand. Your body aches, and blood trickles from your nose.");
        } else if (health <= 20) {
            System.out.println("You collapse to the ground, unable to move. The radiation has ravaged your body.");
        }
    }
}
